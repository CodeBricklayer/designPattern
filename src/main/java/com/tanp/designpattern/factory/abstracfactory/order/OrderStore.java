package com.tanp.designpattern.factory.abstracfactory.order;

/**
 * @author CodeBricklayer
 * @date 2021/4/10 10:08
 * @description 抽象工厂模型的演示
 */
public class OrderStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
