package stack;

public class MyMain {
    public static void main(String[] args) throws MyStackException {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);


        System.out.println("------------------------");

        DynamicStack ds = new DynamicStack(5);
        System.out.println(ds.push(5));
        System.out.println(ds.push(51));
        System.out.println(ds.push(52));
        System.out.println(ds.push(53));
        System.out.println(ds.push(54));
        System.out.println(ds.push(55));
    }
}
