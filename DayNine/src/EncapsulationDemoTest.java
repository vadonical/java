

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/12
 * Time: 15:14
 * All Rights Reserved To Zhenxian
 */

public class EncapsulationDemoTest {
    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo();
        encapsulationDemo.setName("小明");
        encapsulationDemo.setAddress("北京");
        encapsulationDemo.setAge(18);
        System.out.println("姓名是：" + encapsulationDemo.getName());
        System.out.println("地址是：" + encapsulationDemo.getAddress());
        System.out.println("年龄是：" + encapsulationDemo.getAge());
    }
}
