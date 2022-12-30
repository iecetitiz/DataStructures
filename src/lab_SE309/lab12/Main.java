package lab_SE309.lab12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Furniture woodChair = new Furniture("woodChair", 100.0, "wood");
        Furniture ironChair = new Furniture("ironChair", 120.0, "iron");
        Furniture fabricChair = new Furniture("fabricChair", 130.0, "fabric");

        Appliances tv1 = new Appliances("tv1", 1200, 'h');
        Appliances tv2 = new Appliances("tv2", 1200, 'l');
        Appliances tv3 = new Appliances("tv3", 1200, 'm');

        Market market1 = new Market();
        market1.catalog.add(woodChair);
        market1.catalog.add(ironChair);
        market1.catalog.add(fabricChair);
        market1.catalog.add(tv1);
        market1.catalog.add(tv2);
        market1.catalog.add(tv3);

        market1.printList('e');


    }
}
