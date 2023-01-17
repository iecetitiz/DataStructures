package lab_SE309;

public class Stack {
    private int[] stack;
    private int maxLength;
    private int topIndex;

    public Stack() {
        stack = new int[100];
        maxLength = 99;
        topIndex = -1;
    }

    public void push(int number) {
        if(topIndex == maxLength) {
            System.out.println("error! stack is full!");
        } else {
            stack[++topIndex] = number;
        }
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("stack is empty!");
        } else {
            --topIndex;
        }
    }

    public int top() {
        if(isEmpty()) {
            System.out.println("empty!!");
            return 999;
        } else {
            return stack[topIndex];
        }
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }
}
