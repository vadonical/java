/*
* Time 2018-07-03
* Author Zhenxian
* Content 从控制台读取多字符的输入
* */
package DayTwo.com.vadon;

import java.io.*;

public class BRRead {
    public static void main(String []args) throws IOException {
        char c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下'q'退出。");

        do {
            c = (char) bufferedReader.read();
            System.out.println(c);
        }while (c != 'q');
    }
}
