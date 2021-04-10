package com.tanp.designpattern.factory.abstracfactory.pizza;


/**
 * @author CodeBricklayer
 * @date 2021/4/9 20:27
 * @description TODO
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("给北京胡椒披萨 准备原材料");
    }
}
