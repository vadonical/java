import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //以next方式接收字符串
        System.out.println("以next方式接收：");
        if (scanner.hasNext()) {
            String strOne = scanner.next();
            System.out.println("您输入的数据为：" + strOne);
        }

        //以nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        //判断是否还有输入
        if (scanner.hasNextLine()) {
            String strTwo = scanner.nextLine();
            System.out.println("您输入的数据为：" + strTwo);
        }

        //int和float数据的区别
        int i ;
        float f ;
        System.out.println("请输入整数：");
        if (scanner.hasNextInt()) { //判断是否为整数
            i = scanner.nextInt();
            System.out.println("整数数据：" + i);
        } else {
            //输入的信息不是整数时
            System.out.println("您输入的不是整数");
        }
        //输入浮点数
        System.out.println("此时输入浮点数：");
        if (scanner.hasNextFloat()) {
            f = scanner.nextFloat();
            System.out.println("浮点数数据：" + f);
        } else {
            //输入信息不是浮点数时
            System.out.println("输入的不是浮点数（小数）！");
        }

        //输入多个数据求平均数
        double sum = 0;
        int m = 0;

        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m = m + 1;
            sum = sum + x;
        }

        System.out.println(m + "个数的和为：" + sum);
        System.out.print(m + "个数的平均值为：" + (sum / m));
    }
}
