package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isNumber = true;
        while (isNumber) {
            try {
                System.out.print("please enter a number: ");
                int number = scanner.nextInt();
                isNumber = false;
                System.out.println("danke schon!");
            } catch (InputMismatchException e) {
                System.out.println("this is not a number, come on falks!");
                scanner.nextLine(); // bu satiri eklemezsem sonsuz donguye giriyor neden
            }
        }
    }
}
