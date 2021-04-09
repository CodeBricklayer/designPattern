package com.tanp.designpattern.factory.simplefactory.order;

import com.tanp.designpattern.factory.simplefactory.pizza.CheesePizza;
import com.tanp.designpattern.factory.simplefactory.pizza.GreekPizza;
import com.tanp.designpattern.factory.simplefactory.pizza.PepperPizza;
import com.tanp.designpattern.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author CodeBricklayer
 * @date 2021/4/9 19:28
 * @description 订购披萨
 */
public class OrderPizza {

    /**
     * 构造器
     */
//    public OrderPizza(){
//        Pizza pizza = null;
//        //订购披萨的类型
//        String  orderType;
//        do {
//            orderType = getType();
//            if ("greek".equals(orderType)){
//                pizza = new GreekPizza();
//                pizza.setName(" 希腊披萨 ");
//            }else if ("cheese".equals(orderType)){
//                pizza = new CheesePizza();
//                pizza.setName(" 奶酪披萨 ");
//                //新增胡椒披萨
//            }else if ("pepper".equals(orderType)){
//                pizza = new PepperPizza();
//                pizza.setName(" 胡椒披萨 ");
//            } else {
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }

    /**
     * 定义一个简单工厂对象
     */
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
             pizza = this.simpleFactory.createPizza(orderType);
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

    /**
     * 写一个方法，可以获取客户希望订购的披萨种类
     * @return
     */
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
