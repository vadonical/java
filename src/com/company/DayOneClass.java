package com.company;

public class DayOneClass {
    public static void main(String []args){
        DayOneClass dayOneClass = new DayOneClass();

    }
}


class DayOneDemo{
    private int dogAge;
    private String dogName;

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    void printSomething(int dogAge,String dogName){
        System.out.println("This is My dog" + dogName + ",and its age is" + dogAge);
    }

    void dayOneDemo(){
        System.out.println("This is a Line--------------------------------------------");
    }
}