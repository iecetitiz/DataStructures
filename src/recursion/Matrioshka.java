package recursion;

public class Matrioshka {
    public static void main(String[] args) {
printMatruska(3);
    }

    public static void printMatruska(int n) {
        if(n == 0) {
            return;
        }
        System.out.println("before");
        printMatruska(n-1);
        System.out.println("after");
    }
}
