package com.tanp.designpattern.adapter.classadapter;

/**
 * @author CodeBricklayer
 * @date 2021/4/13 20:52
 * @description 适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        //获取到220V电压
        int src = output220V();
        //转成5V
        int dstV = src / 44;
        return dstV;
    }
}
