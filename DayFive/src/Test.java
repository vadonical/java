

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/6
 * Time: 15:00
 * All Rights Reserved To Zhenxian
 */

public class Test {
    public static void main(String[] args) {
        show(new Cow());
        show(new Pig());

        Animal animalOne = new Dog();
        animalOne.eat();
        ((Dog) animalOne).work();
        ((Dog) animalOne).Info("Nick", 5, "公的");
    }

    public static void show(Animal animal) {
        animal.eat();
        if (animal instanceof Cow) {
            Cow cow = (Cow) animal;
            cow.work();
        } else if (animal instanceof Pig) {
            Pig pig = (Pig) animal;
            pig.work();
        }
    }
}

abstract class Animal {
    abstract void eat();
}

class Cow extends Animal {
    public void eat() {
        System.out.println("吃草");
    }

    public static void work() {
        System.out.println("产牛奶");
    }
}

class Pig extends Animal {
    public void eat() {
        System.out.println("吃饲料");
    }

    public static void work() {
        System.out.println("长肥肉");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }

    public static void work() {
        System.out.println("看家");
    }

    public void Info(String name, int age, String sex) {
        System.out.println("狗狗的名字是：" + name);
        System.out.println("狗狗的年龄是：" + age);
        System.out.println("狗狗的性别是：" + sex);
    }
}