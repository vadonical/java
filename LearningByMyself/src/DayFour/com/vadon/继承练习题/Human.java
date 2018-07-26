package DayFour.com.vadon.继承练习题;

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/5
 * Time: 21:35
 * All Rights Reserved To Zhenxian
 */

import java.security.PublicKey;

public class Human {
    private String name;
    private int age;
    private String sex;

    public String getName(){
        return name;
    }

    public void setName(String name){
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

    public void speak(){
        System.out.println("I'm a human!");
    }

    public void run(){
        System.out.println("I can Run!");
    }

    public void getInfo(){
        System.out.println("我的名字是：" + getName()+"，我的年龄是：" + getAge()+ "岁，我的性别是："+getSex());
    }

}

class Man extends Human{

}
