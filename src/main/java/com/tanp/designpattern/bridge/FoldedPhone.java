package com.tanp.designpattern.bridge;

/**
 * @author CodeBricklayer
 * @date 2021/4/15 20:54
 * @description 折叠样式的手机类，继承抽象类Phone
 */
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠样式的手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠样式的手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠样式的手机");
    }
}
