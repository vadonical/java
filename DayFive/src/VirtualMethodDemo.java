

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/6
 * Time: 16:01
 * All Rights Reserved To Zhenxian
 */

public class VirtualMethodDemo {
    public static void main(String []args){
        Salary salary = new Salary("KT","Buma",22,"F",25000);
        salary.pay();
        salary.hasSomeone();

        Person person = new Person("YZX","Gaoling",24,"M");
        person.hasSomeone();
    }
}
