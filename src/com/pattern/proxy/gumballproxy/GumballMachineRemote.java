package com.pattern.proxy.gumballproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 让GumballMachine准备好当一个远程服务
 * 1。为GumballMachine创建一个远程接口。该接口提供一组可以远程调用的方法。
 * 2。确定接口的所有返回类型都是可序列化的。
 * 3。在一个具体类中实现此接口
 */
public interface GumballMachineRemote extends Remote {

    // 所有的返回类型都必须是原语类型或可序列化类型，这是准备支持的方法，每个都要抛出RemoteException

    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;

}
