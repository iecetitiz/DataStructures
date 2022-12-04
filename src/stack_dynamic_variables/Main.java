package stack_dynamic_variables;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.color);

        int number = my_function(5, 3);
        System.out.println(number);

        int[] array = new int[20];

        int number2 = array_function(array);
        System.out.println(number2);

        System.out.println("this line is the end of the program");
    }

    public static int my_function(int a, int b) {
        return a + b;
    }

    public static int array_function(int[] array) {
        return array[0];
    }
}
