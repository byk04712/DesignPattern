package com.pattern.proxy.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * 1.实现远程接口
 *      你的服务必须实现远程接口，也就是客户将要调用的方法的接口。
 * 2.扩展 UnicastRemoteObject
 *      为了要成为远程服务对象，你的对象需要某些“远程的”功能。最简单的方式就是扩展 java.rmi.server.UnicastRemoteObject 让超类帮你做这些工作
 * 3.设计一个不带变量的构造器，并声明RemoteException
 * 4.用RMI Registry注册此服务
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl(int port) throws RemoteException {
        super(port);
    }

    /**
     * 必须实现远程接口。当然你必须要实现所有的接口方法。
     * 注意：不需要声明 RemoteException
     * @return
     */
    @Override
    public String sayHello() {
        System.out.println("Server sayHello()");
        return "Server says, Hey";
    }

    public static void main(String[] args) {
        try {
            // 用 RMI Registry 注册此服务
            MyRemote service = new MyRemoteImpl(9981);
            // Naming.rebind("RemoteHello", service);
            Registry registry = LocateRegistry.createRegistry(9981);
            registry.bind("RemoteHello", service);
            System.out.println("Remote Service Object is bound successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
