package lab_SE309.lab5;

public class GetTheLengthOfAnArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("numberOfElements: " + numberOfElements(numbers));

        int[][] numbers_2d = {
                {1, 2, 3, 4},
                {10, 20, 30, 40},
                {100, 200, 300, 400}
        };

        System.out.println("sum of elements: " + sum(numbers_2d));
        System.out.println("---------------");
        print(numbers_2d);
    }



    //Demonstrate how you can get the length of an array in Java by writing a small program and also show what
    //convenience it brings when compared to C language.
    public static int numberOfElements(int[] numbers) {
        int count = 0;
        for (int i : numbers) {
            count++;
        }
        return count;
    }


    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public static int sum(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count += array[i][j];
            }
        }
        return count;
    }
}
