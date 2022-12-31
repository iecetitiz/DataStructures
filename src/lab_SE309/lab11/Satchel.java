package lab_SE309.lab11;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Satchel  <Thing>{
    private ArrayList<Thing> satchel;


    public Satchel() {
        satchel = new ArrayList<>();
    }

    public void add(Thing thing) {
        if(getSize() == 3) {
            System.out.println("satchel is full!");
            return;
        }
        satchel.add(thing);
    }

    public Thing remove(Thing thing) throws Exception{
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        Thing e = thing;
        satchel.remove(thing);
        return e;
    }

    public int getSize() {
       return satchel.size();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

}
