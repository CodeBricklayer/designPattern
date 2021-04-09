package com.tanp.designpattern.factory.simplefactory.order;

import com.tanp.designpattern.factory.simplefactory.pizza.CheesePizza;
import com.tanp.designpattern.factory.simplefactory.pizza.GreekPizza;
import com.tanp.designpattern.factory.simplefactory.pizza.PepperPizza;
import com.tanp.designpattern.factory.simplefactory.pizza.Pizza;

/**
 * @author CodeBricklayer
 * @date 2021/4/9 19:51
 * @description 披萨工厂（简单工厂类）
 */
public class SimpleFactory {

    /**
     * 根据orderType返回对应的Pizza对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType){
        Pizza  pizza= null;
        if ("greek".equals(orderType)){
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        }else if ("cheese".equals(orderType)){
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
            //新增胡椒披萨
        }else if ("pepper".equals(orderType)){
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨 ");
        }
        return pizza;
    }

    /**
     * 简单工厂模式也叫静态工厂模式
     * @param orderType
     * @return
     */
    public static Pizza createPizza2(String orderType){
        Pizza  pizza= null;
        if ("greek".equals(orderType)){
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        }else if ("cheese".equals(orderType)){
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
            //新增胡椒披萨
        }else if ("pepper".equals(orderType)){
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨 ");
        }
        return pizza;
    }
}
