package DayThree.com.vadon;

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/4
 * Time: 21:51
 * All Rights Reserved To Zhenxian
 */

// 泛型编程之泛型继承
public class MaximumTest {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("Max of %.1f, %.1f and %.1f is %.1f\n\n", 3.1, 4.2, 5.3, maximum(3.1, 4.2, 5.3));
        System.out.printf("Max of %s, %s and %s is %s\n\n", "orange", "apple", "pear", maximum("orange", "apple", "pear"));
    }
}
