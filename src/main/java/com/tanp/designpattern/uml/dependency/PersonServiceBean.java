package com.tanp.designpattern.uml.dependency;

/**
 * @author CodeBricklayer
 * @date 2021/4/6 20:38
 * @description 依赖演示
 */
public class PersonServiceBean {
    private PersonDao personDao;

    public void save(Person person) {

    }

    public IDCard getIDCard(Integer personId) {
        return new IDCard();
    }

    public void modify() {
        Department department = new Department();
    }
}
