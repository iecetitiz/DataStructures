package random;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = (int)Math.floor(a / 2.0);
        System.out.println("b" + b);

        int[] array = new int[10];
        array[0] = 70;
        array[1] = 50;
        array[2] = 40;
        array[3] = 45;
        array[4] = 35;
        array[5] = 39;
        array[6] = 16;
        array[7] = 10;
        array[8] = 9;
        System.out.println("before insert");
        //System.out.println(array.length);
        for(int i: array) {
            System.out.print(i + " ");
        }
        System.out.println("before insert");
        insert(array, 9, 60);
        System.out.println("after insert");
        for(int i: array) {
            System.out.print(i + " ");
        }
    }

    public static void insert(int[] array, int numberOfElement, int value) {
        int lastIndex = numberOfElement;
        array[lastIndex] = value;
        int parentIndex;

        while (lastIndex > 0) {
            parentIndex = ((lastIndex - 1) / 2);
            if (array[parentIndex] < array[lastIndex]) {
                int temp = array[parentIndex];
                array[parentIndex] = array[lastIndex];
                array[lastIndex] = temp;
            } else{
                return;
            }
            lastIndex = parentIndex;

        }
    }

}
