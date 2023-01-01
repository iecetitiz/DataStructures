package queue;

import java.util.ArrayList;

public class Queue<Thing> {
    private ArrayList<Thing> queue;

    public Queue() {
        queue = new ArrayList<>();
    }

    public void enqueue(Thing thing) {
        queue.add(thing);
    }

    public Thing dequeue() throws Exception{
        if(isEmpty()) {
            throw new Exception("queue is empty!");
        }
        Thing t = queue.get(0);
        queue.remove(0);
        return t;
    }

    public int getSize() {
        return queue.size();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }
}
