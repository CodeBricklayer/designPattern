package com.tanp.designpattern.builder.improve;

/**
 * @author CodeBricklayer
 * @date 2021/4/12 20:51
 * @description TODO
 */
public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("给高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("给高楼砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("给高楼封顶");
    }
}
