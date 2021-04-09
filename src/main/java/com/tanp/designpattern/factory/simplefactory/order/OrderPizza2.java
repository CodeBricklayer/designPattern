package com.tanp.designpattern.factory.simplefactory.order;

import com.tanp.designpattern.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author CodeBricklayer
 * @date 2021/4/9 20:08
 * @description 静态工厂订购披萨
 */
public class OrderPizza2 {
    Pizza pizza = null;

    public OrderPizza2() {
        String orderType = "";
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购披萨失败 ");
                break;
            }
        }while (true);
    }

    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
