package stack_mein;

public class Main {
    public static void main(String[] args) throws My_Stack_Exception{
        Stack stack = new Stack(3);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();


    }
}
