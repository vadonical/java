
/*
 * Created by vadonical
 * User: AiBentao
 * Date: 2018/7/27
 * Time: 21:48
 * All Rights Reserved To github.com/vadonical
 */

import java.io.Console;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String s1 = scanner.nextLine();

        System.out.println("What's your Double number?");
        double s2 = scanner.nextDouble();

        System.out.println("What's your next intNumber?");
        int s3 = scanner.nextInt();


        Console console = System.console();
        String username = console.readLine("Username:");
        char[] password = console.readPassword("Password:");
    }
}
