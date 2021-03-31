package com.tanp.designpattern.principle.dependenceinversion.improve.practice;

/**
 * @author CodeBricklayer
 * @ClassName SetterDependenceInversion
 * @Description Setter传递实现依赖
 * @date 2021/3/31 17:21
 */
public class SetterDependenceInversion {
    public static void main(String[] args) {
        ChangHong3 changHong3 = new ChangHong3();
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv(changHong3);
        openAndClose3.open();
    }
}

interface IOpenAndClose3{
    public void open();
    public void setTv(ITV3 itv3);
}

interface ITV3 {
    public void play();
}
class OpenAndClose3 implements IOpenAndClose3{

    private ITV3 itv3;

    @Override
    public void open() {
        this.itv3.play();
    }

    @Override
    public void setTv(ITV3 itv3) {
        this.itv3 = itv3;
    }
}
class ChangHong3 implements ITV3 {

    @Override
    public void play() {
        System.out.println("长虹电视，打开");
    }
}