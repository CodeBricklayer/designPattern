package com.tanp.designpattern.prototype;

/**
 * @author CodeBricklayer
 * @date 2021/4/10 14:41
 * @description TODO
 */
public class Client {
    public static void main(String[] args) {
        //传统的方法
        Sheep sheep = new Sheep("tom", 1, "白色");
        for (int i = 0; i < 10; i++) {
            Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
            System.out.println(sheep1.toString());
        }
    }
}
