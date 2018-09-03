package com.vadon;


public class Main {
    static int a = 4;
    public void testInfo(int n){
        for (int i = 0;i < n;i++){
            System.out.println(i);
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        System.out.println(a);
        Main m = new Main();
        m.testInfo(5);
    }
}
