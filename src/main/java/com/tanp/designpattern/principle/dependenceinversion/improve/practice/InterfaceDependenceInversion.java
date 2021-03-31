package com.tanp.designpattern.principle.dependenceinversion.improve.practice;

/**
 * @author CodeBricklayer
 * @ClassName InterfaceDependenceInversion
 * @Description 通过接口传递实现依赖
 * @date 2021/3/31 17:11
 */
public class InterfaceDependenceInversion {
    public static void main(String[] args) {
        ChangHong1 changHong = new ChangHong1();
        OpenAndClose1 openAndClose = new OpenAndClose1();
        openAndClose.open(changHong);
    }
}


interface IOpenAndClose1 {
    public void open(ITV1 tv);
}

interface ITV1 {
    public void play();
}

class ChangHong1 implements ITV1 {

    @Override
    public void play() {
        System.out.println("长虹电视，打开");
    }
}

class OpenAndClose1 implements IOpenAndClose1 {

    @Override
    public void open(ITV1 tv) {
        tv.play();
    }
}