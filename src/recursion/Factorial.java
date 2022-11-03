package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(facto(7));
    }

    public static int facto(int n) {
        int facto;
        if(n == 1) {
            facto = 1;
            return facto;
        }

        facto = n * facto(n - 1);
        return facto;
    }
}
