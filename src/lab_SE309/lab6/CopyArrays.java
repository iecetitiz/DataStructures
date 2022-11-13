package lab_SE309.lab6;

import java.util.Arrays;

public class CopyArrays {
    public static void main(String[] args) {
        String[] favoriteCities = {"A, n, t, a, l, y, a, A, m, s, t, e, r, d, a, m,"};
        String[] name = {"ece", "melis"};
        name = enlargeSize(name, favoriteCities);

        for(String s: name) {
            System.out.print(s);
        }
        System.out.println(name.length);
    }

    public static String[] enlargeSize(String[] array, String[] largeArray) {
        //newArray = new String[array.length + 1];
        String[]  newArray = Arrays.copyOf(array,largeArray.length);
        return newArray;
    }
}
