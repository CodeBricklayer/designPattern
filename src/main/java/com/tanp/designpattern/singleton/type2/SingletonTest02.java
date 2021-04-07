package com.tanp.designpattern.singleton.type2;

/**
 * @author CodeBricklayer
 * @date 2021/4/7 20:32
 * @description 饿汉式（静态代码块）
 */
public class SingletonTest02 {
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
     * 1、构造器私有化，外部能new
     */
    private Singleton() {

    }

    /**
     * 2、本类内部创建对象实例
     */
    private static Singleton instance;

    //3、在静态代码块中，创建单例对象
    static{
        instance = new Singleton();
    }
    /**
     * 4、提供一个公有的静态方法，返回实例对象
     *
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}
