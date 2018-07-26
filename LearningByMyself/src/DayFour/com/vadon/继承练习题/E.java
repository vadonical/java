package DayFour.com.vadon.继承练习题;

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/5
 * Time: 15:35
 * All Rights Reserved To Zhenxian
 */

/*
 *本案例重点考察类名中设置变量的方法
 *
 * */

class Monkey {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //设置构造参数
    Monkey(String s) {
        this.name = s;
    }

    public void speak() {
        System.out.println("咿咿呀呀");
    }
}

class PeopleThree extends Monkey {
    PeopleThree(String s) {
        super(s);
    }

    public void speak() {
        System.out.println("小样的，不错嘛，还会说话了！");
    }

    public void think() {
        System.out.println("别说话，请认真思考！");
    }

}

class DogThree extends Monkey {
    DogThree(String s) {
        super(s);
    }

    public void speak() {
        System.out.println("汪汪叫");
    }

    public void eat() {
        System.out.println("狗狗会吃东西");
    }

}

public class E {
    public static void main(String[] args) {
        Monkey monkey = new Monkey("Toney");
        System.out.println("我是猴子：" + monkey.getName());
        monkey.speak();

        PeopleThree peopleThree = new PeopleThree("小明");
        System.out.println("我是人类：" + peopleThree.getName());
        peopleThree.think();
        peopleThree.speak();

        DogThree dogThree = new DogThree("旺财");
        System.out.println("我是狗狗：" + dogThree.getName());
        dogThree.speak();
        dogThree.eat();
    }
}
