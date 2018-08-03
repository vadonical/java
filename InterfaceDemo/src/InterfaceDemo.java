interface Animal{
    abstract
    public void eat();
    public void run();
}

interface AnimalOne{
    public void eat();
    public void runOne();
}


public class InterfaceDemo implements Animal,AnimalOne{



    @Override
    public void eat() {
        System.out.println("重写的eat1方法");
    }

    @Override
    public void runOne() {
        System.out.println("重写的runOne方法");
    }

    @Override
    public void run() {
        System.out.println("重写的run方法");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        InterfaceDemo interfaceDemo = new InterfaceDemo();
        interfaceDemo.eat();
        interfaceDemo.run();
        interfaceDemo.runOne();
    }
}
