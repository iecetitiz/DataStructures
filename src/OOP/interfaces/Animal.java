package OOP.interfaces;

import javax.print.DocFlavor;

public abstract class Animal {
    public abstract String sound();
}

class Chicken extends Animal implements Edible {
    public String howToEat() {
        return "mangal";
    }

    public String sound() {
        return  "duddudududuu";
    }
}

abstract class Fruit implements Edible{

}

class Apple extends Fruit{
    public String howToEat(){
        return "apple juice";
    }
}

class Tiger extends Animal {
    public String sound() {
        return "roarrrr!!";
    }
}

class Pine extends Apple {

}


interface Edible {
    public abstract String howToEat();
}

