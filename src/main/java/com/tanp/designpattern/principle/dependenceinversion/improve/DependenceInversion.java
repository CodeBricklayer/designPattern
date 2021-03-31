package com.tanp.designpattern.principle.dependenceinversion.improve;

/**
 * @author CodeBricklayer
 * @ClassName DependenceInversion
 * @Description 依赖倒转原则演示2
 * @date 2021/3/31 16:40
 */
public class DependenceInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

/**
 * 定义一个接口
 */
interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {

    @Override
    public String getInfo() {
        return "电子邮件信息：hello,world";
    }
}

class WeiXin implements IReceiver{

    @Override
    public String getInfo() {
        return "微信消息：hello，world";
    }
}

class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}


