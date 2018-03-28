package com.pattern.proxy.javaproxy;

import java.lang.reflect.Proxy;
import java.util.Hashtable;

public class MacthMakingTestDrive {

    Hashtable<String, PersonBean> datingDB = new Hashtable<String, PersonBean>();

    public static void main(String[] args) {
        MacthMakingTestDrive test = new MacthMakingTestDrive();
        test.drive();
    }
    
    public MacthMakingTestDrive() {
        initializeDatabase();
    }

    private void initializeDatabase() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setHotOrNotRating(7);
        datingDB.put(joe.getName(), joe);

        PersonBean kelly = new PersonBeanImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setHotOrNotRating(6);
        datingDB.put(kelly.getName(), kelly);
    }

    private void drive() {
        PersonBean joe = getPersonFromDatabase("Joe Javabean");

        PersonBean ownerProxy = getOwnerProxy(joe);

        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");

        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());

        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(5);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

    }

    private PersonBean getPersonFromDatabase(String name) {
        return datingDB.get(name);
    }

    /**
     * 此方法需要一个person对象作为参数，然后返回他的代理，因为代理和主题有相同的接口，所以我们返回一个 PersonBean
     * @param person
     * @return
     */
    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
    }

    

}
