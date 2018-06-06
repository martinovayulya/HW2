import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("Enter the size of array");
        int arraySize;
        try {
            arraySize = scanner.nextInt();
        } catch (Exception e) {
            arraySize = -1;
            System.out.println("Please, enter the correct size");
        }
        if (arraySize > 0) {
            System.out.println("Here we go, enter elements of arrаy one by one");
            int[] myArray = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                try {
                    myArray[i] = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println ("Set correct value please");
                    i--;
                    continue;
                }
            }
            for (int i = 0; i < arraySize; i++)
                if (((i + 1) % 3 == 0)&&(i%3 >= 0)) {
                    myArray[i % 3] = 0;
                    System.out.println("Array has been changed");
                }
            for (int i = 0; i < arraySize; i++)
                System.out.println(myArray[i]);
        }
    }
}
