

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/6
 * Time: 15:48
 * All Rights Reserved To Zhenxian
 */

public class Salary extends Person {
    private double salary;

    public Salary(String name, String address, int age, String sex,double salary) {
        super(name, address, age, sex);
        setSalary(salary);
    }

    @Override
    public void hasSomeone() {
        System.out.println("Salary_hasSomeone");
        System.out.println("您的姓名为：" + getName());
        System.out.println("您的地址为：" + getAddress());
        System.out.println("您的年龄为：" + getAge());
        System.out.println("您的性别为：" + getSex());
        System.out.println("您的工资为：" + getSalary());
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double pay() {
        System.out.println("工资给：" + getName());
        return salary;
    }
}
