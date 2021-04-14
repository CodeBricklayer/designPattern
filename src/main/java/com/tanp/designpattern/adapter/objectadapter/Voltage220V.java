package com.tanp.designpattern.adapter.objectadapter;

/**
 * @author CodeBricklayer
 * @date 2021/4/13 20:51
 * @description 被适配类
 */
public class Voltage220V {

    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "V");
        return src;
    }
}
