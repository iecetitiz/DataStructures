package recursion;

public class Recurrence_Relation_CE215 {
    public static void main(String[] args) {
        System.out.println(count2(3));
    }

    public static int count(int n) {
        int an;
        if(n == 0) {
            return 2;
        }
        an = count(n - 1) + 3;
        return an;
    }

    public static int count2(int n) {
        int an;
        if(n == 0) {
            return 3;
        }

        if(n == 1) {
            return 5;
        }

        an = count2(n-1) - count2(n-2);
        return an;
    }
}
