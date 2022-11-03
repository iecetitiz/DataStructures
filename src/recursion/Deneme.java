package recursion;

public class Deneme {
    public static void main(String[] args) {
        print1();
    }

    public static void print1() {
        print2();
        System.out.println(1);
    }

    public static void print2() {
        print3();
        System.out.println(2);
    }

    public static void print3() {
        print4();
        System.out.println(3);
    }

    public static void print4() {
        print5();
        System.out.println(4);
    }

    public static void print5() {
        System.out.println(5);
    }
}
