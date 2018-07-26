package DayFour.com.vadon.继承练习题;

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/5
 * Time: 14:53
 * All Rights Reserved To Zhenxian
 */


class Instrument {
    public void play() {
        System.out.println("弹奏乐器");
    }
    public void play2(){
        System.out.println("调用");
    }

}

class Wind extends Instrument {
    public void play() {
        System.out.println("弹奏Wind");
    }

    public void play2() {
        System.out.println("调用Wind的play2");
    }
}

class Brass extends Instrument {
    public void play() {
        System.out.println("弹奏brass");
    }

    public void play2() {
        System.out.println("调用Brass的play2");
    }
}

public class Music{
    public static void tune(Instrument i){
        i.play();
        i.play2();
    }
    public static void main(String []args){
        Wind wind = new Wind();
        Brass brass = new Brass();
        tune(wind);
        tune(brass);
    }

}