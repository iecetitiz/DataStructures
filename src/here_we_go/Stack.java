package here_we_go;

import java.util.ArrayList;

public class Stack <Thing>{
    private ArrayList<Thing> stack;
    // int size; arrayList kullaniyorum zaten size tutmama gerek bile yok

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(Thing x) {
        stack.add(x);
    }

    public Thing pop() {
        Thing thing = stack.get(getSize() - 1); //dondurecegim seyi once kopyaliyorum
        stack.remove(getSize() - 1);
        return thing;
    }

    public Thing peek() throws Exception{ //TODO peek ne dondurecek
        if(isEmpty()) {
           throw new StackIsEmptyException("Stack is empty!");
        } else {
            return stack.get(getSize() - 1);
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int getSize() {
        return stack.size();
    }
}
