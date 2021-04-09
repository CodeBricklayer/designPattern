package com.tanp.designpattern.factory.simplefactory.pizza;

/**
 * @author CodeBricklayer
 * @date 2021/4/9 19:25
 * @description 奶酪披萨
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨 准备原材料");
    }

}
