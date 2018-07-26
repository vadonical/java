package DayFour.com.vadon.继承练习题;

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/5
 * Time: 15:12
 * All Rights Reserved To Zhenxian
 */


class People{

    protected double height;
    protected double weight;

    public double getHeight() {
        return height;
    }

    public void setHeight(){
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void speakHello(){
        System.out.println("你好");
    }

    public void averageHeight(){
        System.out.println("平均身高是：" + height);
    }

    public void averageWeight(){
        System.out.println("平均体重是：" + weight);
    }
}

class ChinesePeople extends People{

    public void speakHello(){
        System.out.println("你好，我是中国人！");
    }

    public void averageHeight(){
        System.out.println("中国人的平均身高是：" + height);
    }

    public void averageWeight(){
        System.out.println("中国人的平均体重是：" + weight);
    }

    public void chineseKungfu(){
        System.out.println("坐如钟，站如松，睡如弓");
    }
}


class AmericanPeople extends People{

    public void speakHello(){
        System.out.println("你好，我是美国人！");
    }

    public void averageHeight(){
        System.out.println("美国人的平均身高是：" + height);
    }

    public void averageWeight(){
        System.out.println("美国人的平均体重是：" + weight);
    }

    public void americanBoxing(){
        System.out.println("直拳，勾拳");
    }
}



public class TestPeopeOne {
    public static void main(String[] args){
        ChinesePeople chinesePeople = new ChinesePeople();
        chinesePeople.height = 180;
        chinesePeople.weight = 65;
        chinesePeople.speakHello();
        chinesePeople.averageHeight();
        chinesePeople.averageWeight();
        chinesePeople.chineseKungfu();

        AmericanPeople americanPeople = new AmericanPeople();
        americanPeople.height = 190;
        americanPeople.weight = 70;
        americanPeople.speakHello();
        americanPeople.averageHeight();
        americanPeople.averageWeight();
        americanPeople.americanBoxing();
    }
}
