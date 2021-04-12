package com.tanp.designpattern.builder.improve;

/**
 * @author CodeBricklayer
 * @date 2021/4/12 20:44
 * @description 房子 -> 产品
 */
public class House {

    private String basic;

    private String wall;

    private String roofed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
