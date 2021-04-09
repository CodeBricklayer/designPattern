package com.tanp.designpattern.factory.factorymethod.pizza;

/**
 * @author CodeBricklayer
 * @date 2021/4/9 20:26
 * @description TODO
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("给伦敦的奶酪披萨 准备原材料");
    }
}
