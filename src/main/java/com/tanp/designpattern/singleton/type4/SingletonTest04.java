package com.tanp.designpattern.singleton.type4;

/**
 * @author CodeBricklayer
 * @date 2021/4/7 20:38
 * @description 懒汉式（线程安全,同步方法）
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    /**
     * 提供一个静态的公有方法，加入同步处理的代码，解决线程不安全的问题
     *
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}