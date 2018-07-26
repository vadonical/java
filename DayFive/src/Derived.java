

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/6
 * Time: 16:49
 * All Rights Reserved To Zhenxian
 */

class Parent {
    private int i = 20;
    protected int j = 30;
    public int k = 40;
    int h = 50;
}

class Child extends Parent {
    void f() {
        //System.out.println(i); // i has private access in "Present"
        System.out.println(j);
        System.out.println(k);
        System.out.println(h);
    }
}


