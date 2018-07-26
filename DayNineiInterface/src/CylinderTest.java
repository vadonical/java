

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/12
 * Time: 16:46
 * All Rights Reserved To Zhenxian
 */


interface A {
    double PI = 3.14;

    double area();
}

interface B {
    void setColor(String c);
}

interface C extends A, B {
    void volume();
}

class Cylinder implements C {
    private double radius;
    private double height;
    private String color;

    public Cylinder(double radius, double height, String color) {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public void volume() {
        System.out.println("圆柱的体积为：" + this.area() * this.height);
    }
}

public class CylinderTest {
    public static void main(String[] args) {
        System.out.println("Test c1");
        A c1 = new Cylinder(2, 5, "red");
        System.out.println("面积为：" + c1.area());
        System.out.println(((Cylinder) c1).getColor());
        System.out.println("------------分割线---------");
        System.out.println("Test c2");
        B c2 = new Cylinder(5, 2, "blue");
        System.out.println("面积为：" + ((Cylinder) c2).area());
        System.out.println(((Cylinder) c1).getColor());
        c2.setColor("green");
        System.out.println(((Cylinder) c2).getColor());
        System.out.println("------------分割线---------");
        System.out.println("test c3:");
        C c3 = new Cylinder(1, 2, "blank");
        System.out.println("面积为：" + c3.area());
        c3.volume();
        System.out.println(((Cylinder) c3).getColor());
    }
}
