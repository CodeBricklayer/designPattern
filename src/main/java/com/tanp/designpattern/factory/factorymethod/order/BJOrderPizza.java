package com.tanp.designpattern.factory.factorymethod.order;

import com.tanp.designpattern.factory.factorymethod.pizza.BJCheesePizza;
import com.tanp.designpattern.factory.factorymethod.pizza.BJPepperPizza;
import com.tanp.designpattern.factory.factorymethod.pizza.Pizza;

/**
 * @author CodeBricklayer
 * @date 2021/4/9 20:35
 * @description TODO
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
        } else if ("prepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
