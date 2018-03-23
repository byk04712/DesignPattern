package com.pattern.iterator.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {

    private Stack<Iterator> stack = new Stack<Iterator>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        // 将我们要遍历的顶层组合的迭代器传入，我们把它抛进一堆栈数据结构中
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        // 想要知道是否还有下一个元素，我们检查堆栈是否被清空；如果已经空了，就表示没有下一个元素了。
        if (stack.empty()) {
            return false;
        } else {
            // 否则我们就从堆栈的顶层中取出迭代器，看看是否还有下一个元素。
            Iterator<MenuComponent> iterator = stack.peek();
            if (iterator.hasNext()) {
                // 表示还有下一个元素
                return true;
            } else {
                // 如果它没有元素，我们将它弹出堆栈，然后递归地调用hasNext()
                stack.pop();
                return hasNext();
            }
        }
    }

    @Override
    public MenuComponent next() {
        // 当客户想要取得下一个元素的时候，我们先调用 hasNext() 来确定是否还有下一个
        if (hasNext()) {
            // 如果还有下一个元素，我们就从堆栈中取出目前的迭代器，然后取得它的下一个元素
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            // 如果元素是一个菜单，我们有了另一个需要被包含进遍历中的组合，所以我们将它丢尽堆栈中，不管是不是菜单我们都返回该组件
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }
}
