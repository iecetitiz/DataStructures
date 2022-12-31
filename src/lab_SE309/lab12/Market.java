package lab_SE309.lab12;

import java.util.ArrayList;

public class Market {
    private String name;
    private ArrayList<HouseholdItems> catalog;

    Market() {
        catalog = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<HouseholdItems> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<HouseholdItems> catalog) {
        this.catalog = catalog;
    }


    public void list(char type) {
        for (HouseholdItems h : catalog) {
            if (type == 'm' && h instanceof Furniture) {
                System.out.println(h.getName() +  " " + catalog.indexOf(h));
            } else if (type == 'e' && h instanceof Appliances) {
                System.out.println(h.getName() +  " " + catalog.indexOf(h));
            }
        }
    }

    public void search(String name, char type) {
        for (HouseholdItems h : catalog) {
            if (type == 'm' && h instanceof Furniture && h.getName().contains(name)) {
                System.out.println(h.getName() +  " " + catalog.indexOf(h));
            } else if (type == 'e' && h instanceof Appliances && h.getName().contains(name)) {
                System.out.println(h.getName() + " " + catalog.indexOf(h));
            }
        }
    }

    public void addItemToCatalog(HouseholdItems item) {
        catalog.add(item);
    }

    public void removeFromTheCatalog(HouseholdItems item) {
        catalog.remove(item);
    }

}
