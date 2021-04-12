package com.tanp.designpattern.builder;

/**
 * @author CodeBricklayer
 * @date 2021/4/12 20:21
 * @description 盖房子
 */
public abstract class AbstracHouse {

    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌墙
     */
    public abstract void buildWalls();

    /**
     * 封顶
     */
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
