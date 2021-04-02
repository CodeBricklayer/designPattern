package com.tanp.designpattern.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CodeBricklayer
 * @date 2021/4/2 19:32
 * @description 迪米特原则演示2
 */
public class Demeter2 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}


class Employee {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeEmployee {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("学院员工id=" + i);
            list.add(employee);
        }
        return list;
    }
    public void printEmployee(){
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("------学院员工----------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校员工id=" + i);
            list.add(employee);
        }
        return list;
    }


    void printAllEmployee(CollegeManager sub) {
        sub.printEmployee();
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------学校总部员工----------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}

