package com.tanp.designpattern.prototype.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CodeBricklayer
 * @date 2021/4/10 15:07
 * @description spring 中的原型模式
 */
public class Prototype {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object bean = applicationContext.getBean("id01");
        System.out.println("bean=" + bean);
        Object bean2 = applicationContext.getBean("id01");
        System.out.println("bean2=" + bean2);
        System.out.println(bean == bean2);
    }

}
