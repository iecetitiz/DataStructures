package linkedList.my.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        //list.addLast(80);
        //list.addLast(70);
        //list.addLast(60);
        //list.insert(0, 40);
        //list.insert(1, 29);
       // list.insert(2, 59);
       // list.insert(3, 89);
       // list.printForward();
        //list.printBackward();
     //  System.out.println();
      // list.swapWithNext(4);
      //  System.out.println();
       // list.printForward();
        //list.deleteLast();
        //list.printForward();

        list.addLast(2);
        list.addLast(0);
        list.addLast(2);
        list.addLast(0);
        list.addLast(0);
        list.addLast(6);
        list.addLast(0);
        list.addLast(1);
        list.addLast(1);
        list.addLast(0);
        list.addLast(8);

        list.printForward();

    }
}
