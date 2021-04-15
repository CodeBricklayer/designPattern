package com.tanp.designpattern.bridge;

/**
 * @author CodeBricklayer
 * @date 2021/4/15 20:50
 * @description TODO
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }
}
