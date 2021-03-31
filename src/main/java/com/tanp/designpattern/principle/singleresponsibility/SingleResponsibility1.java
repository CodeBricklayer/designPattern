package com.tanp.designpattern.principle.singleresponsibility;

/**
 * @ClassName SingleResponsibility1
 * @Description 单一职责原则演示1
 * @author CodeBricklayer
 * @date 2021/3/31 14:48
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

/**
 * 交通工具类
 * 违反单一职责原则
 */
class Vehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行");
    }
}
