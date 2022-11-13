package random;

public class Test_Car {
    public static void main(String[] args) {
        Car car1 = new Car("bmw", "red");
        Car car2 = new Car("toyota", "red");
        System.out.println(car1.toString());

        Car car3 = car2;

        //System.out.println(car3.equals(car2));
        //System.out.println(car1.equals(car2));

        System.out.println(car1.equals(car2));

    }
}
