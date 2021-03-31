package com.tanp.designpattern.principle.intefacesegregation;

/**
 * @author CodeBricklayer
 * @ClassName Segregation1
 * @Description 接口隔离原则演示1
 * @date 2021/3/31 15:10
 */
public class Segregation1 {
    public static void main(String[] args) {

    }
}

/**
 * 接口
 */
interface InterFace1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements InterFace1 {

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

    @Override
    public void operation4() {
        System.out.println("B 实现了operation4");

    }

    @Override
    public void operation5() {
        System.out.println("B 实现了operation5");

    }
}

class D implements InterFace1 {

    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");

    }

    @Override
    public void operation2() {
        System.out.println("D 实现了operation2");

    }

    @Override
    public void operation3() {
        System.out.println("D 实现了operation3");

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

    public void depend2(InterFace1 i) {
        i.operation2();
    }

    public void depend3(InterFace1 i) {
        i.operation3();
    }
}

class C {
    public void depend1(InterFace1 i) {
        i.operation1();
    }

    public void depend4(InterFace1 i) {
        i.operation4();
    }

    public void depend5(InterFace1 i) {
        i.operation5();
    }
}

