

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/10
 * Time: 15:17
 * All Rights Reserved To Zhenxian
 */

public abstract class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("构造一个雇员");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void oneAddress() {
        System.out.println("名字为：" + this.name + "，地址为：" + this.address);
    }

    public void testMethod() {
        System.out.println("这是抽象类中的一个测试方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
