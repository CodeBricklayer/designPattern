package com.tanp.designpattern.factory.factorymethod.order;

import com.tanp.designpattern.factory.factorymethod.pizza.*;

/**
 * @author CodeBricklayer
 * @date 2021/4/9 20:35
 * @description TODO
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)){
            pizza = new LDCheesePizza();
        } else if ("prepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
