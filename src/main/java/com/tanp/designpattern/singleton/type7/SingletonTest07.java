package com.tanp.designpattern.singleton.type7;

/**
 * @author CodeBricklayer
 * @date 2021/4/7 20:38
 * @description 静态内部类
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton {

    /**
     * 构造器私有化
     */
    private Singleton() {

    }

    /**
     * 静态内部类，该类中有一个静态属性Singleton
     */
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
     * @return
     */
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}