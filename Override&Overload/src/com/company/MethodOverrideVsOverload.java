package com.company;
/*
 * Created by vadonical
 * User: AiBentao
 * Date: 2018/7/26
 * Time: 14:35
 * All Rights Reserved To github.com/vadonical
 */

/*public class OverloadDemo {
    public int test() {
        System.out.println("test1");
        return 1;
    }

    public void test(int a) {
        System.out.println("test2");
    }


    public String test(int a, String s) {
        System.out.println("test3");
        return "re3";
    }

    public String test(String s, int a) {
        System.out.println("test4");
        return "re4";
    }

    public static void main(String[] args) {
        OverloadDemo overloadDemo = new OverloadDemo();
        System.out.println(overloadDemo.test());
        System.out.println("-----------LINE----------");
        overloadDemo.test(5);
        System.out.println("-----------LINE----------");
        System.out.println(overloadDemo.test(5, "hello"));
        System.out.println("-----------LINE----------");
        System.out.println(overloadDemo.test("hello", 5));
    }
}*/


/*
public class MethodOverrideVsOverload {

    private boolean equals(MethodOverrideVsOverload other) {
        System.out.println("MethodOverrideVsOverload equals method reached" );
        return true;
    }

    public static void main(String[] args) {
        Object o1 = new MethodOverrideVsOverload();
        Object o2 = new MethodOverrideVsOverload();

        MethodOverrideVsOverload o3 = new MethodOverrideVsOverload();
        MethodOverrideVsOverload o4 = new MethodOverrideVsOverload();

        if(o1.equals(o2)){
            System.out.println("objects o1 and o2 are equal");
        } else {
            System.out.println("objects o1 and o2 are not equal");
        }

        if(o3.equals(o4)){
            System.out.println("objects o3 and o4 are equal");
        }else {
            System.out.println("objects o3 and o4 are not equal");
        }
    }
}*/


public class MethodOverrideVsOverload {
    @Override
    public boolean equals(Object other) {
        System.out.println("MethodOverrideVsOverload equals method reached");
        return true;
    }

    public static void main(String[] args) {
        Object o1 = new MethodOverrideVsOverload(); //编译期间o1位object类型，执行期间o1为MethodOverrideVsOverload类型
        Object o2 = new MethodOverrideVsOverload(); //编译期间o2位object类型，执行期间o1为MethodOverrideVsOverload类型
        MethodOverrideVsOverload o3 = new MethodOverrideVsOverload(); //编译期间和执行期间o3皆为MethodOverrideVsOverload类型
        MethodOverrideVsOverload o4 = new MethodOverrideVsOverload(); //编译期间和执行期间o3皆为MethodOverrideVsOverload类型

        if (o1.equals(o2)) {
            System.out.println("objects o1 and o2 are equal");
        } else {
            System.out.println("objects o1 and o2 are not equal");
        }

        if (o3.equals(o4)) {
            System.out.println("objects o3 and o4 are equal");
        } else {
            System.out.println("objects o3 and o4 are not equal");
        }
    }
}
