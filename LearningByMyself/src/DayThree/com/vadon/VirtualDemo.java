package DayThree.com.vadon;

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/4
 * Time: 16:41
 * All Rights Reserved To Zhenxian
 */

public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Zhenxian","Guizhou",82140136);
        Employee e = new Salary("Kuangtao","Guiyang",14525452);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
