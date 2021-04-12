package com.tanp.designpattern.builder.improve;

/**
 * @author CodeBricklayer
 * @date 2021/4/12 20:55
 * @description 建造者模式的演示
 */
public class Client {

    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //完成盖房子，返回产品（房子）
        House house = houseDirector.constructHouse();

        //盖高楼
        HighHouse highHouse = new HighHouse();
        houseDirector.setHouseBuilder(highHouse);
        houseDirector.constructHouse();
    }
}
