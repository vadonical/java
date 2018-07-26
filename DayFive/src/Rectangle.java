/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/6
 * Time: 18:03
 * All Rights Reserved To Zhenxian
 */
class Rectangle {
    double chang;
    double kuan;

    Rectangle(double chang, double kuan) {
        this.chang = chang;
        this.kuan = kuan;
    }

    double getArea() {
        return chang * kuan;
    }
}

class Rectangular extends Rectangle {
    double gao;

    Rectangular(double chang, double kuan, double gao) {
        super(chang, kuan);
        this.gao = gao;
    }

    double getVolume() {
        return gao * getArea();
    }
}

class RectangleTest {
    public static void main(String[] args) {
        System.out.println("开始执行");
        Rectangular rectangular = new Rectangular(15, 12, 5);
        System.out.println("这是体积计算：" + rectangular.getVolume());
        System.out.println("这是面积计算：" + rectangular.getArea());

        System.out.println("另一种实例化方式：");
        System.out.println("这是面积计算：" + new Rectangle(15, 12).getArea());
        System.out.println("这是体积计算：" + new Rectangular(15, 12, 5).getVolume());
    }
}