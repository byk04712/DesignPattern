package com.pattern.compound;

/**
 * 观察者接口
 */
public interface Observer {
    /**
     * 有更新时调用
     * @param duck
     */
    public void update(QuackObservable duck);
}
