package com.tanp.designpattern.uml.composition;

/**
 * @author CodeBricklayer
 * @date 2021/4/7 15:39
 * @description 组合的演示
 */
public class Computer {

    private Mouse mouse = new Mouse();

    private Monitor monitor = new Monitor();

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
