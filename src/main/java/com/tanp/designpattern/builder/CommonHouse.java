package com.tanp.designpattern.builder;

/**
 * @author CodeBricklayer
 * @date 2021/4/12 20:23
 * @description 普通房子
 */
public class CommonHouse extends AbstracHouse {
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }
}
