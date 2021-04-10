package com.tanp.designpattern.prototype.improve;

/**
 * @author CodeBricklayer
 * @date 2021/4/10 14:40
 * @description 羊
 */
public class Sheep implements Cloneable {

    private String name;

    private int age;

    private String color;

    private String address = "蒙古羊";

    private Sheep friend;

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Sheep getFriend() {
        return friend;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", friend=" + friend +
                '}';
    }

    /**
     * 克隆该实例，使用默认的clone方法来完成
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
