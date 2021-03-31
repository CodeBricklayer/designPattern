package com.tanp.designpattern.principle.intefacesegregation.improve;

/**
 * @author CodeBricklayer
 * @ClassName Segregation2
 * @Description 接口隔离原则演示2
 * @date 2021/3/31 15:10
 */
public class Segregation2 {
    public static void main(String[] args) {
        A a = new A();
        //A类通过接口去依赖B类
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

/**
 * 接口
 */
interface InterFace1 {
    void operation1();
}

interface InterFace2 {
    void operation2();

    void operation3();
}

interface InterFace3 {
    void operation4();

    void operation5();
}

class B implements InterFace1, InterFace2 {

    @Override
    public void operation1() {
        System.out.println("B 实现了operation1");

    }

    @Override
    public void operation2() {
        System.out.println("B 实现了operation2");

    }

    @Override
    public void operation3() {
        System.out.println("B 实现了operation3");

    }
}

class D implements InterFace1, InterFace3 {

    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");

    }


    @Override
    public void operation4() {
        System.out.println("D 实现了operation4");

    }

    @Override
    public void operation5() {
        System.out.println("D 实现了operation5");

    }
}

class A {
    public void depend1(InterFace1 i) {
        i.operation1();
    }

    public void depend2(InterFace2 i) {
        i.operation2();
    }

    public void depend3(InterFace2 i) {
        i.operation3();
    }
}

class C {
    public void depend1(InterFace1 i) {
        i.operation1();
    }

    public void depend4(InterFace3 i) {
        i.operation4();
    }

    public void depend5(InterFace3 i) {
        i.operation5();
    }
}

