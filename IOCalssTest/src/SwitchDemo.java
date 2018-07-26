import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'C';

        Scanner scanner = new Scanner(System.in);



        switch (grade) {
            case 'A':
                System.out.println("您的成绩非常优异");
                break;
            case 'B':
                System.out.println("您的成绩良好");
                break;
            case 'C':
                System.out.println("您的成绩还行");
                break;
            case 'D':
                System.out.println("您的成绩及格");
                break;
            case 'E':
                System.out.println("同学你要加油");
                break;
            default:
                System.out.println("您的输入有误");
        }

        System.out.println("您的等级为：" + grade);
    }
}
