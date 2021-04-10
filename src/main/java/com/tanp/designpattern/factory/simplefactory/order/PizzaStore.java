package com.tanp.designpattern.factory.simplefactory.order;

/**
 * @author CodeBricklayer
 * @date 2021/4/9 19:34
 * @description 披萨店 简单工厂的演示
 */
public class PizzaStore {
    public static void main(String[] args) {
        //传统方式
//        new OrderPizza();

        //工厂模式
//        new OrderPizza(new SimpleFactory());
        //静态工厂
        new OrderPizza2();
        System.out.println("退出程序");
    }
}
