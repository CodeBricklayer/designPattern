package com.tanp.designpattern.prototype.deepclone;

/**
 * @author CodeBricklayer
 * @date 2021/4/10 15:45
 * @description 深拷贝的演示
 */
public class Client {
    public static void main(String[] args) throws Exception {
        DeepPrototype p = new DeepPrototype();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        //方式1 完成深拷贝
        DeepPrototype p2 = (DeepPrototype) p.clone();

        System.out.println("p.name=" + p.name + " p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p2.name + " p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

        //方式2 完成深拷贝
        DeepPrototype p3 = (DeepPrototype) p.deepClone();
        System.out.println("p3.name=" + p3.name + " p3.deepCloneableTarget=" + p3.deepCloneableTarget.hashCode());
    }
}
