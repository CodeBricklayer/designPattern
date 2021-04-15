package com.tanp.designpattern.bridge;

/**
 * @author CodeBricklayer
 * @date 2021/4/15 20:52
 * @description 手机
 */
public abstract class Phone {

    /**
     * 组合品牌
     */
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}
