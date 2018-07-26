package DayTwo.com.vadon;

public class MethodDemo {
    public static void main(String[] args) {
        printMax(34,3,3,2,56,23);
        printMax(new double[]{1,2,3});
        printMax(new double[]{25,75,65,45,62,12,58,54});
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > result)
                result = numbers[i];
        System.out.println("The max value is " + result);
    }
}
