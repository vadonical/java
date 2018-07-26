

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/10
 * Time: 15:33
 * All Rights Reserved To Zhenxian
 */

public class InheritanceEmployee extends Employee{
    public InheritanceEmployee(String name, String address, int number) {
        super(name, address, number);
    }

    public void oneAddress(){
        System.out.println("你的名字是：" + getName());
        System.out.println("你的地址是：" + getAddress());
        System.out.println("你的数字是：" + getNumber());
    }
}
