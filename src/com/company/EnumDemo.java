package com.company;

public class EnumDemo {
    public static void main(String []args){
        FreshJuice freshJuice = new FreshJuice();
        freshJuice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println(freshJuice.size);
        freshJuice.size = FreshJuice.FreshJuiceSize.SMALL;
        System.out.println(freshJuice.size);
        freshJuice.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println(freshJuice);
        System.out.println(freshJuice.size);
        System.out.println(freshJuice);
    }

}

class FreshJuice{
    enum FreshJuiceSize{SMALL,MEDIUM,LARGE}
    FreshJuiceSize size;
}
