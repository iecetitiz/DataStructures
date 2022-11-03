package stack;

import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(4);
        stack.push(45);
        stack.push(12);
        stack.push(7);

        System.out.println(stack.pop());

    }

}
