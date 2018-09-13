import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input x:");
        int x = scanner.nextInt();
        System.out.println("Please input y:");
        int y = scanner.nextInt();
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        System.out.println("the greatest common divisor:" + x);
    }
}
