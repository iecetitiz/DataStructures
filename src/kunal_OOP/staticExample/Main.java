package kunal_OOP.staticExample;

public class Main {
    public static void main(String[] args) {
        //Human kunal = new Human(22, "kunal", 10000, false);
       // Human rahul = new Human(22, "rahul", 20000, true);
        //Human jenny = new Human(25, "jenny", 30000, true);

        //System.out.println(Human.population);
        // System.out.println(Human.population);
    }

    static void fun() {
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    void greeting() {
        System.out.println("hello world");
    }
}
