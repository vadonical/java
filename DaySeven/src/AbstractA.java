

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/10
 * Time: 16:05
 * All Rights Reserved To Zhenxian
 */

public abstract class AbstractA {
    private int a;

    public abstract void testA();

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class SubclassB extends AbstractA {
    @Override
    public void testA() {
        System.out.println("这是抽象父类中的方法");
    }
}


