
/*
 * Created by vadonical
 * User: AiBentao
 * Date: 2018/7/27
 * Time: 11:08
 * All Rights Reserved To github.com/vadonical
 */

import com.sun.xml.internal.bind.v2.runtime.output.DOMOutput;

public class GenericType {
    private static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            //System.out.println(element);
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] doublesArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        Character[] charactersArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("\nArray integersArray contains:");
        printArray(integersArray);

        System.out.println("\nArray doublesArray contains:");
        printArray(doublesArray);

        System.out.println("\nArray charactersArray contains:");
        printArray(charactersArray);
    }
}
