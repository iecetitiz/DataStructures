package lab_SE309.lab12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Furniture woodChair = new Furniture("woodChair", 100.0, "wood");
        Furniture ironChair = new Furniture("ironChair", 120.0, "iron");
        Furniture fabric_chair = new Furniture("fabricChair", 130.0, "fabric");
        Furniture woodtable = new Furniture("woodtable", 140.0, "wood");
        Furniture fabricTable = new Furniture("fabrictable", 110.0, "fabric");
        Furniture irontable = new Furniture("irontable", 150.80, "iron");

        Appliances tv1 = new Appliances("tv1", 1200, 'h');
        Appliances tv2 = new Appliances("tv2", 1300, 'l');
        Appliances tv3 = new Appliances("tv3", 1400, 'm');

        Market market1 = new Market();
        market1.addItemToCatalog(woodChair);
        market1.addItemToCatalog(ironChair);
        market1.addItemToCatalog(fabric_chair);
        market1.addItemToCatalog(woodtable);
        market1.addItemToCatalog(fabricTable);
        market1.addItemToCatalog(irontable);
        market1.addItemToCatalog(tv1);
        market1.addItemToCatalog(tv2);
        market1.addItemToCatalog(tv3);



        //market1.list('m');

        //market1.removeFromTheCatalog(irontable);
        //System.out.println("----------------");
        //market1.search("table", 'm');


        User user = new User();
        user.connect(market1);
        System.out.println("total price: " + user.calculate());

        market1.search("table", 'm');
    }
}
