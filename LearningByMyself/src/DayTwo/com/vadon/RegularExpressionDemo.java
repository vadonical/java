/*
* Time 2018.07.03
* author Zhenxian
* Content 从一个给定的字符串中查找数字串
*
*/
package DayTwo.com.vadon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpressionDemo {
    public static void main(String[] args) {

        //按指定模块在字符串中查找
        String line = "This order was placed for QT3000!Ok?";
        String pattern = "(.*)(\\d+)(.*)";

        //创建Pattern对象
        Pattern r = Pattern.compile(pattern);

        //创建matcher对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found Value:" + m.group(0));
            System.out.println("Found Value:" + m.group(1));
            System.out.println("Found Value:" + m.group(2));
        } else {
            System.out.println("No match");
        }
    }
}
