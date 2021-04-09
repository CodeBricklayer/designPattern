package com.tanp.designpattern.factory.factorymethod.order;



import com.tanp.designpattern.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author CodeBricklayer
 * @date 2021/4/9 20:29
 * @description TODO
 */
public abstract class OrderPizza {

    /**
     * 定义一个抽象方法，createPizza,让各个工程子类自己实现
     * @param orderType
     * @return
     */
    abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        Pizza pizza = null;
        //订购披萨的类型
        String  orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            if (pizza!=null) {
                //披萨制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
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
