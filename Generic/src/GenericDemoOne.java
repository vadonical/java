public class GenericDemoOne {
    private static <T extends Comparable<T>> T maximum(T x, T y, T z) {
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
        System.out.printf("%d, %d, %d中最大的数为 %d\n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("%.1f, %.1f, %.1f中最大的数为 %.1f\n", 3.5, 4.2, 2.5, maximum(3.5, 4.2, 2.5));
        System.out.printf("%s, %s, %s中最大的数为 %s\n", "apple", "pear", "orange", maximum("apple", "pear", "orange"));
    }
}
