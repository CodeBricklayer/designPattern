package com.tanp.designpattern.factory.simplefactory.pizza;

/**
 * @author CodeBricklayer
 * @date 2021/4/9 19:27
 * @description 希腊披萨
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨 准备原材料");
    }
}
