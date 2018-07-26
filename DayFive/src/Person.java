

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/6
 * Time: 15:35
 * All Rights Reserved To Zhenxian
 */

public class Person {
    private String name;
    private String address;
    private int age;
    private String sex;

    public Person(String name, String address, int age, String sex) {
        System.out.println("构造函数");
        this.name = name;
        this.address = address;
        this.age = age;
        this.sex = sex;
    }

    public void hasSomeone() {
        System.out.println("Person_hasSomeone");
        System.out.println("名字叫：" + this.name);
        System.out.println("地址为：" + this.address);
        System.out.println("年龄为：" + this.age);
        System.out.println("性别为：" + this.sex);
    }

    public String toString() {
        return name + " " + address + "" + age;
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

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
