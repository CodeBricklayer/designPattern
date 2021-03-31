package com.tanp.designpattern.principle.singleresponsibility;

/**
 * @author CodeBricklayer
 * @ClassName SingleResponsibility3
 * @Description 单一职责原则演示3
 * @date 2021/3/31 14:53
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}

class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空上运行");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水面上运行");
    }
}
