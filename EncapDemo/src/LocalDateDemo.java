
/*
 * Created by vadonical
 * User: AiBentao
 * Date: 2018/7/30
 * Time: 10:02
 * All Rights Reserved To github.com/vadonical
 */

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        int month = localDate.getMonthValue();
        int today = localDate.getDayOfMonth();

        localDate = localDate.minusDays(today-1);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int value = dayOfWeek.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("  ");
        while (localDate.getMonthValue() == month){
            System.out.printf("%3d",localDate.getDayOfMonth());
            if (localDate.getDayOfMonth() == month)
                System.out.print("*");
            else
                System.out.print(" ");

            localDate = localDate.plusDays(1);
            if (localDate.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if (localDate.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
