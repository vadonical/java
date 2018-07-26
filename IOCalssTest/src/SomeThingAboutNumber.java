public class SomeThingAboutNumber {
    public static void main(String[] args) {
        //compareTo()的使用
        //指定的数小于参数返回-1
        //指定的数等于参数返回0
        //指定的数大于参数返回1

        Integer a = 6;
        int b = 6;
        System.out.println(a == b);//true
        System.out.println(a.compareTo(3));
        System.out.println(a.compareTo(5));
        System.out.println(a.compareTo(8));

        //xxxValue()函数的使用
        Integer c = 5;
        System.out.println(c.byteValue());
        System.out.println(c.doubleValue());
        System.out.println(c.longValue());
        System.out.println(c.shortValue());
        System.out.println(c.SIZE);
    }
}
