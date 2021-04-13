package com.tanp.designpattern.adapter.classadapter;

/**
 * @author CodeBricklayer
 * @date 2021/4/13 20:56
 * @description 类适配器的演示
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
