package lab_SE309.lab13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[5];
        String[] stringArray = new String[5];

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("enter a number");
            int number = Integer.parseInt(scanner.nextLine());
            intArray[i] = number;
        }

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("enter a word");
            String word = scanner.nextLine();
            stringArray[i] = word;
        }

        System.out.println(stringArray[0]);

        scanner.close();

    }



}
