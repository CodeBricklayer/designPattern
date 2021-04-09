package com.tanp.designpattern.factory.simplefactory.pizza;

/**
 * @author CodeBricklayer
 * @date 2021/4/9 19:42
 * @description 胡椒披萨
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给胡椒披萨 准备原材料");
    }
}
