

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/10
 * Time: 16:25
 * All Rights Reserved To Zhenxian
 */


abstract class Role {
    private String name;
    private int age;
    private String sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public abstract void play(); // 抽象方法

    public Role() {
        System.out.println("这是抽象类Role中蛋疼的方法");
    }

    public Role(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}

class EmployeeOne extends Role {
    private double salary;
    private static String ID;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static String getID() {
        return ID;
    }

    public static void setID(String iD) {
        ID = iD;
    }

    public EmployeeOne() {
        System.out.println("这是EmployeeOne中蛋疼的方法");
    }

    public EmployeeOne(String name, int age, String sex, double salary, String ID) {
        super(name, age, sex);
        this.salary = salary;
        this.ID = ID;
    }

    @Override
    public void play() {
        // 重写抽象类中的play()方法
        System.out.println("员工编号:" + this.getID());

    }

    final void employeeInfo() {
        System.out.println("员工姓名:" + this.getName() + "员工性别:" + this.getSex() + "员工年龄:" + this.getAge() + "员工工资:" + this.getSalary());
    }
}


class Manager extends EmployeeOne {
    final String vehicle;

    public Manager(String name, int age, String sex, double salary, String ID, String vehicle) {
        super(name, age, sex, salary, ID);
        this.vehicle = "保时捷";
    }
}

public class PracticeOne {
    public static void main(String[] args) {
        // 构造EmployeeOne
        EmployeeOne employeeOne = new EmployeeOne("张三", 18, "男", 5000, "123456");
        employeeOne.play();
        employeeOne.employeeInfo();
        // 构造Manager
        Manager manager = new Manager("李四", 20, "男", 4500, "123457", "");
        manager.play();
        manager.employeeInfo();
        System.out.println("座驾是：" + manager.vehicle);
    }
}
