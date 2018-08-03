

//interface AnimalOne{
//    public void eat();
//    public void runOne();
//}

/*interface Animal {
    void eat();

    void run();
}

interface MammalAnimal extends Animal {
    void breathingWithLungs();

    void viviparous();

    void biggerBody();
}

interface Dog extends MammalAnimal {
    void bark();

    void housekeeping();
}

public class InterfaceDemo implements Dog {

    @Override
    public void eat() {
        System.out.println("重写的Animal中eat方法");
    }

    @Override
    public void run() {
        System.out.println("重写的Animal中run方法");
    }

    @Override
    public void breathingWithLungs() {
        System.out.println("重写的MammalAnimal中breathingWithLungs方法");
    }

    @Override
    public void viviparous() {
        System.out.println("重写的MammalAnimal中viviparous方法");

    }

    @Override
    public void biggerBody() {
        System.out.println("重写的MammalAnimal中biggerBody方法");

    }

    @Override
    public void bark() {
        System.out.println("重写的Dog中bark方法");

    }

    @Override
    public void housekeeping() {
        System.out.println("重写的Dog中housekeeping方法");

    }

    public static void main(String[] args) {
        InterfaceDemo interfaceDemo = new InterfaceDemo(); //实例化一个对象
        interfaceDemo.eat(); //动物中的吃方法
        interfaceDemo.run(); //动物中的走方法
        interfaceDemo.breathingWithLungs(); //哺乳动物中的用肺呼吸方法
        interfaceDemo.viviparous(); //哺乳动物中的胎生方法
        interfaceDemo.biggerBody(); //哺乳动物中的大体格方法
        interfaceDemo.bark(); //狗狗中的叫方法
        interfaceDemo.housekeeping(); //狗狗中的看家方法
    }
}*/


interface Animal {
    void eat();

    void run();
}

interface MammalAnimal {
    void breathingWithLungs();

    void viviparous();

    void biggerBody();
}

interface Dog extends MammalAnimal, Animal { //接口中继承两个接口，当这个接口被继承时，实现所有相关的方法
    void bark();

    void housekeeping();
}

public class InterfaceDemo implements Dog {

    public static void main(String[] args) {
        InterfaceDemo interfaceDemo = new InterfaceDemo(); //实例化一个对象
        interfaceDemo.eat(); //动物中的吃方法
        interfaceDemo.run(); //动物中的走方法
        interfaceDemo.breathingWithLungs(); //哺乳动物中的用肺呼吸方法
        interfaceDemo.viviparous(); //哺乳动物中的胎生方法
        interfaceDemo.biggerBody(); //哺乳动物中的大体格方法
        interfaceDemo.bark(); //狗狗中的叫方法
        interfaceDemo.housekeeping(); //狗狗中的看家方法
    }

    @Override
    public void eat() {
        System.out.println("重写的Animal中eat方法");
    }

    @Override
    public void run() {
        System.out.println("重写的Animal中run方法");
    }

    @Override
    public void breathingWithLungs() {
        System.out.println("重写的MammalAnimal中breathingWithLungs方法");
    }

    @Override
    public void viviparous() {
        System.out.println("重写的MammalAnimal中viviparous方法");

    }

    @Override
    public void biggerBody() {
        System.out.println("重写的MammalAnimal中biggerBody方法");

    }

    @Override
    public void bark() {
        System.out.println("重写的Dog中bark方法");

    }

    @Override
    public void housekeeping() {
        System.out.println("重写的Dog中housekeeping方法");

    }
}