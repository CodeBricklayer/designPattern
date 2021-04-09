package com.tanp.designpattern.factory.factorymethod.pizza;

/**
 * @author CodeBricklayer
 * @date 2021/4/9 20:27
 * @description TODO
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("给伦敦胡椒披萨 准备原材料");
    }
}
