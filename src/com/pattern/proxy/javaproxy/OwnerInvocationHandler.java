package com.pattern.proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 所有调用处理器都实现 InvocationHandler 接口
 */
public class OwnerInvocationHandler implements InvocationHandler {

    private PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 如果方法是一个 getter，我们就调用 person 内的方法
        if (method.getName().startsWith("get")) {
            return method.invoke(person, args);
        }
        // 否则如果方法是 setHotOrNotRating，我们就抛出 IllegalStateException 表示不允许
        else if (method.getName().equals("setHotOrNotRating")) {
            throw new IllegalStateException();
        }
        // 因为我们是拥有者，所以除 setHotOrNotRating 之外的任何其他 set 方法都可以调用
        else if (method.getName().startsWith("set")) {
            return method.invoke(person, args);
        }
        // 如果调用其他的方法，一律不予理会
        return null;
    }

}
