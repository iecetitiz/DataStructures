package lab_SE309.lab12;

import java.util.ArrayList;

public class Market {
    String name;
    ArrayList<HouseholdItems> catalog;

    Market() {
        catalog = new ArrayList<>();
    }

    public void printList(char type) {
        for (HouseholdItems h : catalog) {
            if (type == 'm' && h instanceof Furniture) {
                System.out.println(h.getName());
            } else if (type == 'e' && h instanceof Appliances) {
                System.out.println(h.getName());
            }
        }
    }
}
