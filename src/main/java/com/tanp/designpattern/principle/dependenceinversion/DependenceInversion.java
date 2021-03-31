package com.tanp.designpattern.principle.dependenceinversion;

/**
 * @author CodeBricklayer
 * @ClassName DependenceInversion
 * @Description 依赖倒转原则演示1
 * @date 2021/3/31 16:34
 */
public class DependenceInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息：hello,world";
    }
}

/**
 * 完成Person接收消息的功能
 */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
