package DayFive.com.vadon;

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/6
 * Time: 13:20
 * All Rights Reserved To Zhenxian
 */

public class OverrideDemoTest {

    public void printDemo() {
        System.out.println("无参方法");
    }

    public void printDemo(int a) {
        System.out.println("一个参数的方法，参数为：" + a);
    }

    public void printDemo(int a, String b) {
        System.out.println("两个参数的方法，第一个参数为：" + a + " 第二个参数为：" + b);
    }

    public static void main(String[] args) {
        OverrideDemoTest overrideDemoTest = new OverrideDemoTest();
        overrideDemoTest.printDemo();
        overrideDemoTest.printDemo(1);
        overrideDemoTest.printDemo(1, "Hello");
    }
}
