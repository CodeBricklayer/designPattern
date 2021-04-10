package com.tanp.designpattern.factory.abstracfactory.pizza;


/**
 * @author CodeBricklayer
 * @date 2021/4/9 20:26
 * @description TODO
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("给北京的奶酪披萨 准备原材料");
    }
}
