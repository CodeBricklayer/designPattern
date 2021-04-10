package com.tanp.designpattern.factory;

import java.util.Calendar;

/**
 * @author CodeBricklayer
 * @date 2021/4/10 10:22
 * @description JDK中的Calendar类中，就使用了简单工厂模式
 */
public class Test {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        //注意，月份下标从0开始，所以月份要+1
        System.out.println("年" + cal.get(Calendar.YEAR));
        System.out.println("月" + (cal.get(Calendar.MONTH) + 1));
        System.out.println("日" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分" + cal.get(Calendar.MINUTE));
        System.out.println("秒" + cal.get(Calendar.SECOND));
    }
}
