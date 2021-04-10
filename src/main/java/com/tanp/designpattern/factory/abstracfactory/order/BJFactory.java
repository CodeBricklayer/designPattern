package com.tanp.designpattern.factory.abstracfactory.order;


import com.tanp.designpattern.factory.abstracfactory.pizza.Pizza;
import com.tanp.designpattern.factory.abstracfactory.pizza.BJCheesePizza;
import com.tanp.designpattern.factory.abstracfactory.pizza.BJPepperPizza;

/**
 * @author CodeBricklayer
 * @date 2021/4/10 9:59
 * @description TODO
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
        } else if ("prepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
