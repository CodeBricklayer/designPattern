package com.tanp.designpattern.builder.improve;

/**
 * @author CodeBricklayer
 * @date 2021/4/12 20:23
 * @description 普通房子 -> 具体建造者
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }
}
