package arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fruit> fruitList = new ArrayList<>(10);
        Fruit fruit1 = new Fruit();
        Fruit fruit2 = new Fruit();
        Fruit fruit3 = new Fruit();
        fruitList.add(fruit1);
        fruitList.add(fruit2);
        fruitList.get(1).toString();
    }
}
