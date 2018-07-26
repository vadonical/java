

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/10
 * Time: 16:55
 * All Rights Reserved To Zhenxian
 */


interface ConstantValue {
    double PI = 3.1415926;  // 设置定值PI
}

abstract class Shape {
    double length;
    double area;

    abstract double getLength(); // 构造虚方法
    abstract double getArea(); // 构造虚方法
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getLength() {
        length = 2 * ConstantValue.PI * radius;
        return length;
    }

    @Override
    double getArea() {
        area = ConstantValue.PI * radius * radius;
        return area;
    }
}

class Rectangle extends Shape{
    double width,height;

    Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    @Override
    double getLength() {
        length = (width + height) * 2;
        return length;
    }

    @Override
    double getArea() {
        area = width * height;
        return area;
    }
}

class Cone {
    Shape bottom;
    double height;

    public Cone(Shape bottom, double height) {
        super();
        this.bottom = bottom;
        this.height = height;
    }

    double getVolume() {
        return bottom.getArea() * height / 3;
    }
}

public class TestShape {
    public static void compute(Shape shape){
        System.out.println(shape.getClass());
        System.out.println("周长为：" + shape.getLength());
        System.out.println("面积为：" + shape.getArea());
    }
    public static void main(String []args){
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("创建一个底面为圆形的椎体");
        Cone cone = new Cone(circle,10);
        compute(circle);
        System.out.println("体积为：" + cone.getVolume());
        System.out.println("------------这是华丽的分割线-------------");
        System.out.println("创建一个底面为矩形的椎体");
        cone = new Cone(rectangle,10);
        compute(rectangle);
        System.out.println("体积为：" + cone.getVolume());
    }
}
