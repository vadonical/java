

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/6
 * Time: 17:13
 * All Rights Reserved To Zhenxian
 */

class Birds {
    int leg = 2;
    int wings = 2;

    public void fly() {
        System.out.println("鸟儿能够飞翔");
    }

    public void grow() {
        System.out.println("鸟儿都有两只翅膀和两条腿");
    }
}

class Sparrow extends Birds {

    public void printAge(int age) {
        System.out.println("鸟儿的年龄是：" + age);
    }

    public void printHeight(int height) {
        System.out.println("鸟儿飞行的高度是：" + height);
    }

}

class Ostrich extends Birds {
    public void printWight(int weight) {
        System.out.println("鸵鸟的体重是：" + weight);
    }

    public void printSpeed(int speed) {
        System.out.println("鸵鸟的速度是：" + speed);
    }
}

class Eagle extends Birds {
    public static void hunt() {
        System.out.println("鹰会捕食");
    }

    public static void height(int height) {
        System.out.println("鹰飞翔的高度是：" + height);
    }
}

public class BirdTest {
    public static void main(String[] args) {
        Birds birds = new Birds();
        birds.fly();
        birds.grow();

        //父类实例化调用
        System.out.println(); //这是一个换行
        Birds birdsOne = new Sparrow();
        birdsOne.grow();
        birdsOne.fly();
        //子类调用父类的方式
        ((Sparrow) birdsOne).printAge(5);
        ((Sparrow) birdsOne).printHeight(200);

        //子类调用
        System.out.println(); //这是一个换行
        Ostrich ostrich = new Ostrich();
        ostrich.fly();
        ostrich.grow();
        ostrich.printSpeed(60);
        ostrich.printWight(100);

        //直接调用static方法
        System.out.println(); //这是一个换行
        Eagle.hunt();
        Eagle.height(800);
    }
}
