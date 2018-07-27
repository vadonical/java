package com.company;
/*
 * Created by vadonical
 * User: AiBentao
 * Date: 2018/7/26
 * Time: 13:18
 * All Rights Reserved To github.com/vadonical
 */


class Animal {
    public void move() {
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        super.move();
        System.out.println("狗狗可以跑和移动");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        // Animal对象
        Animal animal = new Animal();
        // Dog对象
        Animal dog = new Dog();

        animal.move(); // 执行Animal对象的方法
        System.out.println("-----------LINE----------");
        dog.move(); // 执行Dog对象的方法
    }
}
