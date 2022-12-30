package OOP.generic;

public class MyBoundenGenericClass <Thing, Thing2 extends Number>{
    Thing x;
    Thing2 y;

    MyBoundenGenericClass(Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing2 getY() {
        return y;
    }
}
