package stack_mein;

import stack.MyStackException;

import java.util.Arrays;

public class Stack {
    private int[] elements;
    //private int index; //bunu da kullanmama gerek yok size ile isimi halledebilirim
    //private int capacity; //BUNU KULLANMAMA GEREK YOKTU CUNKU CPACITY SADECE BIR PARAMETRE OLACAK
    public static final int DEFAULT_CAPACITY = 16;
    private int size; //counts the number of elements in the stack

    Stack() {
       this(DEFAULT_CAPACITY);

    }

    Stack(int capacity) {
        elements = new int[capacity];
        size = 0;
    }

    public void push(int value) {
        if(isFull()) {
            int[] temp = Arrays.copyOf(elements, elements.length * 2);
            elements = temp;
        }

        elements[size] = value;
        size++;
    }

    public int pop() throws My_Stack_Exception {
        if(isEmpty()) {
            throw new My_Stack_Exception("stack is empty");
        }
        size--;
        int top = elements[size];

        return top;
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public int getSize() {
        return size;
    }
}
