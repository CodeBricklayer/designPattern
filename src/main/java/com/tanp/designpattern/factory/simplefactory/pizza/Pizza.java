package com.tanp.designpattern.factory.simplefactory.pizza;

/**
 * @author CodeBricklayer
 * @date 2021/4/9 19:22
 * @description 将披萨类设计为抽象类
 */
public abstract class Pizza {

    protected String name;

    /**
     * 准备原材料，不同的披萨不一样，因此，我们设计抽象方法
     */
    public abstract void prepare();

    /**
     * 烘烤
     */
    public void bake() {
        System.out.println(name + " baking;");
    }

    /**
     * 切割
     */
    public void cut() {
        System.out.println(name + " cutting;");
    }

    /**
     * 打包
     */
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
