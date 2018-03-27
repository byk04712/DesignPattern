package com.pattern.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 1.扩展 java.rmi.Remote
 *      Remote 是一个“记号” 接口，表示此接口要用来支持远程调用。所以 Remote 不具有方法。
 *      对于RMI来说，Remote接口具有特别的意义，所以我们必须遵守规则。
 * 2.声明所有的方法都会抛出RemoteException。
 *      客户使用远程接口调用服务。会调用实现远程接口的Stub上的方法，而Stub底层用到了网络和I/O，所以各种坏事情都可能会发生。客户必须认识到风险，通过处理或声明远程异常来解决。
 * 3.确定变量和返回值是属于原语(primitive)类型或者可序列化(Serializable)类型
 */
public interface MyRemote extends Remote {
    // 每次远程方法调用都必须考虑成是“有风险的”。在每个方法中声明RemoteException，可以让客户注意到这件事，并了解这可能是无法工作的。
    public String sayHello() throws RemoteException;
}
