package com.company;

public class EmployeeTest {
    public static void main(String[] args) {
        //使用构造器创建两个对象
        Employee employeeOne = new Employee("James Smith");
        Employee employeeTwo = new Employee("Marry Anne");

        //调用这两个成员变量的方法
        employeeOne.empAge(25);
        employeeOne.empDesignation("Senior Software Engineer");
        employeeOne.empSalary(10000);
        employeeOne.printEmployee();

        employeeTwo.empAge(26);
        employeeTwo.empDesignation("Software Engineer");
        employeeTwo.empSalary(15000);
        employeeTwo.printEmployee();
    }
}
