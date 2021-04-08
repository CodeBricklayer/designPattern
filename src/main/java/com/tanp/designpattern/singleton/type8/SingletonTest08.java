package com.tanp.designpattern.singleton.type8;

/**
 * @author CodeBricklayer
 * @date 2021/4/8 20:45
 * @description 枚举
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
        instance.sayOk();
    }
}

enum Singleton{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok~~");
    }
}
