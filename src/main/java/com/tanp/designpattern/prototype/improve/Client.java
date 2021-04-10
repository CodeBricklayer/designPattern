package com.tanp.designpattern.prototype.improve;


/**
 * @author CodeBricklayer
 * @date 2021/4/10 14:41
 * @description 原型模式的演示
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.setFriend(new Sheep("jack",2,"黑色"));
        System.out.println("原型模式完成对象的创建");
        //克隆
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();
        System.out.println("sheep2=" + sheep2 + ",sheep2.friend.hashcode():" + sheep2.getFriend().hashCode());
        System.out.println("sheep3=" + sheep3 + ",sheep3.friend.hashcode():" + sheep3.getFriend().hashCode());
        System.out.println("sheep4=" + sheep4 + ",sheep4.friend.hashcode():" + sheep4.getFriend().hashCode());
        System.out.println("sheep5=" + sheep5 + ",sheep5.friend.hashcode():" + sheep5.getFriend().hashCode());

        sheep.getFriend().setAge(3);

        System.out.println("tom的朋友长大了一岁");
        System.out.println("sheep2=" + sheep2);
    }
}
