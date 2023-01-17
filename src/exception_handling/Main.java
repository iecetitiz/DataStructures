package exception_handling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number:");
        int number1 = scanner.nextInt();
        System.out.println("please enter another number:");
        int number2 = scanner.nextInt();
        try {
            int result = quotient_method(number1, number2);
            System.out.println("result: " + result);
            System.out.println("here is try block");
        } catch (ArithmeticException e) {
            System.out.println("you can not enter a zero");
            System.out.println(e.toString());
        }
    }

    public static int quotient_method(int number1, int number2) {
        if(number2 == 0) {
            throw new ArithmeticException("0 can not acceptable");
        }
        return number1 / number2;
    }
}
