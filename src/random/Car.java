package random;

public class Car {
    String color;
    String brand;
    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String toString() {
        return super.toString() + " this is a car";
    }
}
