package com.tanp.designpattern.adapter.objectadapter;

/**
 * @author CodeBricklayer
 * @date 2021/4/13 20:52
 * @description 适配器类
 */
public class VoltageAdapter implements IVoltage5V {

    /**
     * 关联关系-聚合
     */
    private Voltage220V voltage220V;

    /**
     * 通过构造器，传入一个Voltage220V实例
     *
     * @param voltage220V
     */
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        //获取到220V电压
        if (null != voltage220V) {
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配");
            //转成5V
            dst = src / 44;
            System.out.println("适配完成，输出的电压为=" + dst);
        }
        return dst;
    }
}
