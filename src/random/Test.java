package random;

public class Test {
    public static void main(String[] args) {
        A a = new A("ece");
        a.print();
    }
}

class A {
    String s;

    A(String newS) {
        s = newS;
    }

    public void print() {
        System.out.print(s);
    }
}
