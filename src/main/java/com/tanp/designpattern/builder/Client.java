package com.tanp.designpattern.builder;

/**
 * @author CodeBricklayer
 * @date 2021/4/12 20:24
 * @description 传统模式的演示
 */
public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
