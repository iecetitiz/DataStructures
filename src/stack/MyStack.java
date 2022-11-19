package stack;

public class MyStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public MyStack() {
        this(DEFAULT_SIZE);
    }

    public MyStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if(isFull()) {
            System.out.println("Stack is full!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("can not pop stack is empty!");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws MyStackException{
        if(isEmpty()) {
            throw new MyStackException("can not peek stack is empty!");
        }
         return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length -1; //ptr at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
