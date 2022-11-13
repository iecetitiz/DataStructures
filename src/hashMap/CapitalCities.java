package hashMap;

import java.util.HashMap;

public class CapitalCities {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Spain", "Madrid");

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Spain"));
        capitalCities.remove("Germany");
        System.out.println(capitalCities);
        System.out.println("size: " + capitalCities.size());

        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println("-------------------");
        
    }
}
