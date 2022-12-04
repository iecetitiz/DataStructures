package OOP;

public class Main {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Apple", "yellow");
        Fruit fruit2 = new Fruit("Banana", "red");
        Fruit fruit3= new Fruit("Pineapple", "green");

        fruit1 = fruit2;
        fruit2 = fruit3;

        System.out.println(fruit1.name);
    }
}
