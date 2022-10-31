package linkedList.my.circularDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        list.addLast(2);
        list.addLast(8);
        list.addLast(6);
       list.addLast(1);
       list.addLast(5);
       list.addLast(56);
       // list.addLast(7);
       // list.addLast(14);
      // list.addLast(51);
      // list.addLast(13);
      //  list.addLast(90);
      //  list.addLast(16);
      //  list.addLast(977);
      //  list.addLast(978);
      //  list.addLast(979);

        list.display();
       // System.out.println();
        //System.out.println(list.getNode(3, true).value);
       // System.out.println(list.getSize());
       list.deleteMiddle();
        list.display();
        //System.out.println();
        //list.deleteMiddle();
       // list.display();
    }
}
