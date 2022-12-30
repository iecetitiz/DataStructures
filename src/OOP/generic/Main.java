package OOP.generic;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 6.8, 7.6};
        String[] StringArray = {"B", "Y", "E"};

        System.out.println("----------------------------------");

        Player player = new Player();
        Item item = new Item();
        Tree tree = new Tree();
        Enemy enemy = new Enemy();

        displayInfo(StringArray);

        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(1.5);
        MyGenericClass<String> myString = new MyGenericClass<>("ece");

        MyBoundenGenericClass<String, Integer> myBoundenGenericClass = new MyBoundenGenericClass<>("ece", 4);
        System.out.println(myBoundenGenericClass.getY());
        //System.out.println(myDouble.toString());



    }

    public static <Thing> void displayInfo(Thing thing) {
        System.out.println(thing.toString());
    }

    public static <Thing> Thing getFirst(Thing[] array) {
        return array[0];
    }

}
