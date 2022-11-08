package random;

import java.util.Scanner;

public class BaseBExpansion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer for expansion");
        int number = scanner.nextInt();
        System.out.println("enter an integer for base");
        int base = scanner.nextInt();

        String print = "";

        int quotient = number;
        while(quotient != 0) {
            print += String.valueOf(quotient % base);
            quotient = quotient / base;
        }
        StringBuilder newPrint = new StringBuilder(print);
        System.out.println(newPrint.reverse());
    }
}
