public class GenericDemo {
    private static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s",element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] douArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        Character[] chaArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("整数数组的元素为：");
        printArray(intArray);

        System.out.println("双精度数组的元素为：");
        printArray(douArray);

        System.out.println("字符数组的元素为：");
        printArray(chaArray);
    }
}
