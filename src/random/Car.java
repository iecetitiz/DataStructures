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

    public boolean equals(Object o) {
        if(o instanceof Car) {
            return brand == ((Car)o).brand;
        } else {
            return this == o;
        }
    }

}
