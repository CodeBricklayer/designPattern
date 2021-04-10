package com.tanp.designpattern.factory.abstracfactory.order;


import com.tanp.designpattern.factory.abstracfactory.pizza.Pizza;
import com.tanp.designpattern.factory.abstracfactory.pizza.LDCheesePizza;
import com.tanp.designpattern.factory.abstracfactory.pizza.LDPepperPizza;

/**
 * @author CodeBricklayer
 * @date 2021/4/10 9:59
 * @description TODO
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)){
            pizza = new LDCheesePizza();
        } else if ("prepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
