package linkedList.kunal.LinkedLists;

import linkedList.kunal.LinkedLists.DLL;

public class Main {
    public static void main(String[] args) {
        //LL list = new LL();
        //list.insertFirst(3);
        //list.insertFirst(2);
        //list.insertFirst(8);
        // list.insertFirst(17);
        //list.display();
        // list.insertLast(99);
        //System.out.println();
        //list.display();
        //list.insert(100,3);
        //System.out.println();
        //list.display();
        //System.out.println();
        //System.out.println(list.deleteFirst());
        //System.out.println(list.deleteLast());
        //list.display();
        //System.out.println(list.delete(2));
        //list.display();

        //DLL list = new DLL();
        //list.insertFirst(3);
        //list.insertFirst(2);
        //list.insertFirst(8);
        //list.insertFirst(17);
        //list.insertLast(99);
        //list.insertAfter(99, 65);
        //list.display();

        CLL list = new CLL();
        list.insert(8);
        list.insert(9);
        list.insert(1);
        list.insert(5);
        list.display();
        list.deleteValue(20);
        list.display();
    }
}
