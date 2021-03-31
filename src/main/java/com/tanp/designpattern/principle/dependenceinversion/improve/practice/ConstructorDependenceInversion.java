package com.tanp.designpattern.principle.dependenceinversion.improve.practice;

/**
 * @author CodeBricklayer
 * @ClassName ConstructorDependenceInversion
 * @Description 构造器传递实现依赖
 * @date 2021/3/31 17:15
 */
public class ConstructorDependenceInversion {
    public static void main(String[] args) {
        ChangHong2 changHong2 = new ChangHong2();
        OpenAndClose2 openAndClose2 = new OpenAndClose2(changHong2);
        openAndClose2.open();
    }

}

interface IOpenAndClose2 {
    public void open();
}

interface ITV2 {
    public void play();
}


class OpenAndClose2 implements IOpenAndClose2{
    public ITV2 itv2;

    public OpenAndClose2(ITV2 itv2) {
        this.itv2 = itv2;
    }

    @Override
    public void open() {
        this.itv2.play();
    }
}
class ChangHong2 implements ITV2 {

    @Override
    public void play() {
        System.out.println("长虹电视，打开");
    }
}