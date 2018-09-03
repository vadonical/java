public class GenericMethodTest {
    private static <E> void printInfo(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s\n", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Integer:");
        printInfo(intArray);
        System.out.println("Double:");
        printInfo(doubleArray);
        System.out.println("Character:");
        printInfo(characterArray);
    }
}
