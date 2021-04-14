package com.tanp.designpattern.adapter.interfaceadapter;

/**
 * @author CodeBricklayer
 * @date 2021/4/14 20:26
 * @description 接口适配器模式的演示
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter(){
            //只需要去覆盖我们需要使用的接口方法
            @Override
            public void method1() {
                System.out.println("使用了method1方法");
            }
        };
        absAdapter.method1();
    }
}
