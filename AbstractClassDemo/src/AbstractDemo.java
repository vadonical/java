
/*
 * Created by vadonical
 * User: AiBentao
 * Date: 2018/7/28
 * Time: 11:35
 * All Rights Reserved To github.com/vadonical
 */

abstract class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("构建一个员工对象");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() {
        System.out.println("员工中的方法");
        return 0.0;
    }

    public void mailCheck() {
        System.out.println("邮件发给" + name + "，地址是" +
                address + "，工号为" + number);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }
}


class Salary extends Employee {
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    @Override
    public void mailCheck() {
        System.out.println("重写超类的邮件方法方法：");
        System.out.println("邮件发给" + getName() + "，地址是" +
                getAddress() + "，工号为" + getNumber() + "，工资为" + salary);
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    @Override
    public double computePay() {
        System.out.println("工资发给：" + getName());
        return salary / 52;
    }
}

public class AbstractDemo {
    public static void main(String[] agrs) {
        //错误，抽象类不行被实例化
        //Employee employee = new Employee("张三","北京",123456);

        Salary salary = new Salary("张三", "北京",
                123456, 10000);
        System.out.println("salary调用邮件方法：");
        salary.mailCheck();
        System.out.println("------------------------LINE-------------------");
        Employee employee = new Salary("李四", "上海",
                654321, 20000);
        System.out.println("employee调用邮件方法：");
        employee.mailCheck();
    }
}
