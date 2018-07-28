
/*
 * Created by vadonical
 * User: AiBentao
 * Date: 2018/7/28
 * Time: 12:38
 * All Rights Reserved To github.com/vadonical
 */

abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void abstractMethod();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class AbstractMethodDemo extends Person {

    public AbstractMethodDemo(String name, int age) {
        super(name, age);
    }

    @Override
    public void abstractMethod() {
        System.out.println("子类必须实现抽象类中的抽象方法：");
        System.out.println("姓名是" + getName() + ",年龄为" + getAge());
    }

    public static void main(String[] args) {
        AbstractMethodDemo abstractMethodDemo = new AbstractMethodDemo("张三", 18);
        abstractMethodDemo.abstractMethod();
        System.out.println("------------------------LINE-------------------");
        Person person = new AbstractMethodDemo("李四", 25);
        person.abstractMethod();
    }
}
