import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class DateDemo {
    public static void main(String []args){
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Data:" + ft.format(dNow));

        Date date = new Date();
        String stringOne = String.format("Current Date/Time:%tc",date);

        System.out.println(stringOne);
    }
}
