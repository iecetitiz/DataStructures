package kunal_OOP;

public class Swap {
    public static void main(String[] args) {
        Integer a = 40;
        Integer b = 50;

        System.out.println("before swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        swap(a, b);

        System.out.println("after swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
