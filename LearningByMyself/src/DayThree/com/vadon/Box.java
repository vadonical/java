package DayThree.com.vadon;

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/4
 * Time: 22:03
 * All Rights Reserved To Zhenxian
 */

//泛型编程之泛型类

public class Box<T> {
    private T t;
    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String []args){
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String >();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello,Zhenxian"));

        System.out.printf("Integer Value :%d\n\n",integerBox.get());
        System.out.printf("String Value :%s\n\n",stringBox.get());
    }
}
