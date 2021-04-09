package com.tanp.designpattern.factory.simplefactory.order;

/**
 * @author CodeBricklayer
 * @date 2021/4/9 19:34
 * @description 披萨店
 */
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }
}
