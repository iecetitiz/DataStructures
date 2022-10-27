package recursion;

public class FindNthFibonacciNumber {
    public static void main(String[] args) {
        int fiboNth = fibo(4);
        System.out.println(fiboNth);
    }

    static int fibo(int n) {
        int fibo;
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
       fibo = fibo(n-1) + fibo(n - 2);
       return fibo;
    }
}
