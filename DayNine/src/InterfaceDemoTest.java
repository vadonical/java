

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/12
 * Time: 15:44
 * All Rights Reserved To Zhenxian
 */

public class InterfaceDemoTest implements Animal {

    @Override
    public void eat() {
        System.out.println("动物吃东西");
    }

    @Override
    public void traal() {
        System.out.println("动物会旅行");
    }

    public void testMethod() {
        System.out.println("实现接口类中的方法");
    }

    public static void main(String[] args) {
        InterfaceDemoTest interfaceDemoTest = new InterfaceDemoTest();
        interfaceDemoTest.eat();
        interfaceDemoTest.traal();
        interfaceDemoTest.testMethod();
    }
}
