package com.company;
/*
 * Created by vadonical
 * User: AiBentao
 * Date: 2018/7/26
 * Time: 20:49
 * All Rights Reserved To github.com/vadonical
 */

class Dance {
    public void play() {
        System.out.println("Dance.play");
    }

    public void play(int i) {
        System.out.println("Dance.play" + i);
    }
}

class Latin extends Dance {
    @Override
    public void play() {
        System.out.println("Latin.play");
    }

    public void play(char c) {
        System.out.println("Latin.play" + c);
    }
}

class Jazz extends Dance {
    @Override
    public void play() {
        System.out.println("Jazz.play");
    }

    public void play(double d) {
        System.out.println("Jazz.play" + d);
    }
}

public class Polymorphism {
    private void perform(Latin dance) {  // 定义perform方法
        dance.play();
    }

    private void perform(Jazz dance) {   // 定义perform方法
        dance.play();
    }

    public static void main(String[] args) {
        new Polymorphism().perform(new Latin()); // 向上转型
        new Polymorphism().perform(new Jazz());  // 向上转型
    }
}
