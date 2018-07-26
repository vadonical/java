package com.company;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    //Employee的构造器
    public Employee(String name) {
        this.name = name;
    }

    //设置age的值
    public void empAge(int empAge) {
        age = empAge;
    }

    //设置designation的值
    public void empDesignation(String emDesignation) {
        designation = emDesignation;
    }

    //设置salary的值
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    //打印信息
    public void printEmployee() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Designation:" + designation);
        System.out.println("Salary:" + salary);
    }
}
