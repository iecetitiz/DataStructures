package recursion;

public class Week1Functions {
    public static void main(String[] args) {
        int a = f(4);
        System.out.println("a: " + a);

        //int b = bad(6);
        //System.out.println("b: " + b);
    }

    //
    public static int f(int x) {
        if (x == 0) {
            return 0;
        } else {
            return 2 * f(x - 1) + (x * x);
        }
    }

    //infinite loop
    public static int bad(int n) {
        if(n == 0) {
            return 0;
        } else {
            return bad(n/3 + 1) + n - 1;
        }
    }

}
