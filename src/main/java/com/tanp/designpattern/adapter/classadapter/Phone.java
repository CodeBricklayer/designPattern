package com.tanp.designpattern.adapter.classadapter;

/**
 * @author CodeBricklayer
 * @date 2021/4/13 20:54
 * @description
 */
public class Phone {
    /**
     * 充电
     */
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V，可以充电~~~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压不为5V，不可以充电~~~");
        }
    }
}
