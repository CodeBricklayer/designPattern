package com.tanp.designpattern.adapter.objectadapter;

/**
 * @author CodeBricklayer
 * @date 2021/4/13 20:56
 * @description 对象适配器的演示
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
