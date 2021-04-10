package com.tanp.designpattern.prototype.bean;

/**
 * @author CodeBricklayer
 * @date 2021/4/10 15:04
 * @description TODO
 */
public class Monster {

    private Integer id = 10;
    private String nickName = "牛魔王";
    private String skill = "芭蕉扇";

    public Monster() {
        System.out.println("monster 创建....");
    }

    public Monster(Integer id, String nickName, String skill) {
        this.id = id;
        this.nickName = nickName;
        this.skill = skill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
}
