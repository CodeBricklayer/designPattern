package com.tanp.designpattern.uml.composition;

/**
 * @author CodeBricklayer
 * @date 2021/4/7 15:53
 * @description 组合和聚合的演示
 */
public class Person {

    /**
     * 聚合
     */
    private IDCard idCard;

    /**
     * 组合
     */
    private Head head = new Head();
}
