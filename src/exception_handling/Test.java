package exception_handling;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter a number:");
        int number1 = scanner.nextInt();
        System.out.println("pls enter another number:");
        int number2 = scanner.nextInt();

        try {
            System.out.println(quotient(number1, number2));
            System.out.println("oralarda nasil bilmem buralarda oh hava mis!");

        } catch (ArithmeticException ex) {
            System.out.println("yok anam burda hata var");
        } catch (RuntimeException ex) {
            System.out.println("her yer hata");
        }

    }

    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("sifira da bolme bi zahmet aaaa!");
        }

        return number1 / number2;
    }
}
