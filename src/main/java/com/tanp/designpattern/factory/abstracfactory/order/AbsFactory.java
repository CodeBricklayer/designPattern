package com.tanp.designpattern.factory.abstracfactory.order;


import com.tanp.designpattern.factory.abstracfactory.pizza.Pizza;

/**
 * @author CodeBricklayer
 * @date 2021/4/10 9:58
 * @description 抽象工厂
 */
public interface AbsFactory {
    Pizza createPizza(String orderType);
}
