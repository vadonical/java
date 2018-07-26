

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/10
 * Time: 15:39
 * All Rights Reserved To Zhenxian
 */

public class AbstractTest {
    public static void main(String[] args) {
        // 通过子类实例化抽象类
        Employee employee = new InheritanceEmployee("小明", "北京", 10010110);
        employee.oneAddress();

        //调用抽象类中的测试方法
        employee.testMethod();
    }
}
