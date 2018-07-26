package DayThree.com.vadon;

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/4
 * Time: 15:00
 * All Rights Reserved To Zhenxian
 */

public class Overloading {

    public int test() {
        System.out.println("testOne");
        return 1;
    }

    public void test(int a) {
        System.out.println("testTwo");
    }

    public String test(int a, String s) {
        System.out.println("tsetThree");
        return "returnTestThree";
    }

    public String test(String s, int a) {
        System.out.println("testFour");
        return "returnTestFour";
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        System.out.println(overloading.test());
        overloading.test(1);
        System.out.println(overloading.test(1, "testThree"));
        System.out.println(overloading.test("testFour", 1));
    }
}
