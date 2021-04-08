package com.tanp.designpattern.singleton.type6;

/**
 * @author CodeBricklayer
 * @date 2021/4/7 20:38
 * @description 双重检查
 */
public class SingletonTest06 {
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
     * volatile 防止指令重排
     */
    private static volatile Singleton instance;

    private Singleton() {

    }

    /**
     * 提供一个静态的公有方法，加入双重检查的代码，解决线程安全的问题，同时解决懒加载问题
     *
     * @return
     */
    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}