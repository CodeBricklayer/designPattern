package com.tanp.designpattern.principle.singleresponsibility;/**


/**
 * @ClassName SingleResponsibility2
 * @Description 单一职责原则演示2
 * @author CodeBricklayer
 * @date 2021/3/31 14:48
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路运行");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天空运行");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水面上运行");
    }
}
