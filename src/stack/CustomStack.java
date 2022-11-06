package stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if(isFull()) {
            System.out.println("stack is full bro!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int pop() throws StackException{
        if(isEmpty()) {
            throw new StackException("can not pop from an empty stack!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws StackException{ //what is at the top
        if(isEmpty()) {
            throw new StackException("can not peek from an empty stack!");
        }
        return data[ptr];
    }

}
