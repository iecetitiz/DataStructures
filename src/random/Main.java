package random;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Cherry c1 = null;
        //c1.getColor();
        //System.out.println("ece");

        //int a = 5;
        //if(a % 2 != 0) {
        //  System.out.println((a /2) +1 );
        //}
        int i = 1;
        int n = 50;
        while (i < n) {
            int j = n;
            while (j > 0) {
                j = j / 2;
                System.out.println(j);
            }
            i = i * 2;
        }
    }
}
