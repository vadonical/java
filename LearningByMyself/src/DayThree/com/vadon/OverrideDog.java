package DayThree.com.vadon;

/*
 * Created by Zhenxian Yang.
 * User: Zhenxian
 * Date: 2018/7/4
 * Time: 11:17
 * All Rights Reserved To Zhenxian
 */

public class OverrideDog {
    public static void main(String []args){
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.move();
        dog.move();
        ((Dog) dog).bark();
        animal.bark();

    }
}

class Animal{
    public void move(){
        System.out.println("动物可以行走！");
    }
    public void bark(){

    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("狗狗可以行走！");
    }

    public void bark(){
        System.out.println("狗狗可以吠叫！");
    }
}