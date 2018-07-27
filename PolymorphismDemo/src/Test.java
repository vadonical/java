/*
 * Created by vadonical
 * User: AiBentao
 * Date: 2018/7/26
 * Time: 17:51
 * All Rights Reserved To github.com/vadonical
 */


/*
abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("吃鱼");
    }

    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("吃骨头");
    }

    public void work() {
        System.out.println("看家");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        show(new Cat());    //Cat对象调用show方法
        show(new Dog());    //Dog对象调用show方法

        Animal animal = new Cat();//向上转型
        animal.eat();   //调用的是Cat的eat()
        Cat cat = (Cat) animal;     //向下转型
        cat.work();     //调用Cat的work()
    }

    public static void show(Animal animal) {
        animal.eat();
        if (animal instanceof Cat) {        //判断类型
            Cat cat = (Cat) animal;
            cat.work();
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.work();
        }
    }
}
*/


class A {
    public String run(D obj) {
        return ("A & D");
    }

    public String run(A obj) {
        return ("A & A");
    }
}

class B extends A {
    public String run(B obj) {
        return ("B & B");
    }

    public String run(A obj) {
        return ("B & A");
    }
}

class C extends B {
}

class D extends B {
}

public class Test {
    public static void main(String[] args) {
        A aa = new A();
        A ab = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println("1--" + aa.run(b));
        System.out.println("2--" + aa.run(c));
        System.out.println("3--" + aa.run(d));
        System.out.println("4--" + ab.run(b));
        System.out.println("5--" + ab.run(c));
        System.out.println("6--" + ab.run(d));
        System.out.println("7--" + b.run(b));
        System.out.println("8--" + b.run(c));
        System.out.println("9--" + b.run(d));
    }
}