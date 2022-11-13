package lab_SE309.lab6;

import java.util.Arrays;

public class ArrayEnlarging {
    public static void main(String[] args) throws Exception{
        String birtCity = "Mersin";
        String[] cities = new String[birtCity.length()];

        String[] favoriteCities = {"A", "n", "t", "a", "l", "y", "a", "A", "m", "s", "t", "e", "r", "d", "a", "m", "T", "o", "k", "y", "o"};
        System.out.println(favoriteCities.length);

        for(int i = 0; i < favoriteCities.length; i++) {
            try{
                cities[i] = favoriteCities[i];
            } catch (IndexOutOfBoundsException ex) {
                cities = changeSize(cities, favoriteCities);
                cities[i] = favoriteCities[i];
            }
        }

        for(String c : cities) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println(cities.length);
    }

    public static String[] changeSize(String[] array, String[] largeArray) {
        String[]  newArray = Arrays.copyOf(array,largeArray.length);
        return newArray;
    }
}
