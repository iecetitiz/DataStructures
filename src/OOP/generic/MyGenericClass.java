package OOP.generic;

public class MyGenericClass<Thing> {
    Thing x;

    MyGenericClass(Thing x) {
        this.x = x;
    }

    public Thing getValue() {
        return x;
    }

    public String toString() {
        if (x instanceof Double) {
            System.out.println("this a double!!!");
        }
        return "this is a toString() method";
    }


}
