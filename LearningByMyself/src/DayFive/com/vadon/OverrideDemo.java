package DayFive.com.vadon;

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/6
 * Time: 13:01
 * All Rights Reserved To Zhenxian
 */

public class OverrideDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animalPrint();

        Animal cat = new Cat();
        cat.animalPrint();

        Animal dog = new Dog();
        dog.animalPrint();
    }
}

class Animal {
    public void animalPrint() {
        System.out.println("这是动物");
    }

}

class Cat extends Animal {
    @Override
    public void animalPrint() {
        System.out.println("这是猫");
    }
}

class Dog extends Animal {
    @Override
    public void animalPrint() {
        System.out.println("这是狗狗");
    }
}



