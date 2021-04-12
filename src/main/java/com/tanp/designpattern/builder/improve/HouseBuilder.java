package com.tanp.designpattern.builder.improve;

/**
 * @author CodeBricklayer
 * @date 2021/4/12 20:44
 * @description 房子建造者 -> 抽象建造者
 */
public abstract class HouseBuilder{

    protected House house = new House();

    /**
     * 将建造的流程写好，抽象的方法
     */
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    /**
     * 建造房子,将产品（房子）返回
     */
    public House buildHouse(){
        return house;
    }
}
