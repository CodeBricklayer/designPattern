package com.tanp.designpattern.uml.aggregation;

/**
 * @author CodeBricklayer
 * @date 2021/4/7 15:39
 * @description 聚合的演示
 */
public class Computer {

    private Mouse mouse;

    private Monitor monitor;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
