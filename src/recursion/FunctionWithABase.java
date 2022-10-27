package recursion;

public class FunctionWithABase {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        System.out.println(n);
        print(n + 2);
    }
}
