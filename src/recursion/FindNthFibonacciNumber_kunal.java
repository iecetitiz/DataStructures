package recursion;

public class FindNthFibonacciNumber_kunal {
    public static void main(String[] args) {
        int fiboNth = fibo(7);
        System.out.println(fiboNth);
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);

    }
}
