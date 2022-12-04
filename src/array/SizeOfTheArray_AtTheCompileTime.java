package array;

import java.util.Scanner;

public class SizeOfTheArray_AtTheCompileTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter a size for the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("size of the array is:" + array.length);
    }
}
