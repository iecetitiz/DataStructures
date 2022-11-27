package lab_SE309.midtermprep;

public class Precedence {
    public static void main(String[] args) {
        int b = 3;
        int c = 4;
        int a = 5+-b*c;
        System.out.println(a);

        int A = Integer.MAX_VALUE;
        int C = Integer.MAX_VALUE;
        int B = Integer.MIN_VALUE;
        int D = Integer.MIN_VALUE;

        System.out.println(A + B + C + D);
        System.out.println(A + C);

    }
}
