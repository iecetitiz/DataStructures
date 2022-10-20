package linkedList.singlyLinkedList;

import linkedList.singlyLinkedList.Node;
import linkedList.singlyLinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        /*sll.head = new Node(10);
        Node second = new Node(1);
        Node third = new Node(8);
        Node fourth = new Node(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

       sll.display();
       System.out.println();
       int length = sll.findLength();
        System.out.print("length of the list: " + length + "\n");
        sll.insertNodeAtTheBeginning(34);
        sll.display();
        sll.insertNodeAtTheBeginning(55 );
        System.out.println();
        sll.display();
        sll.insertAtTheEnd(28);
        sll.display();
        sll.insertTheGivenPosition(999, 14);
        System.out.println();
        */

        sll.insertAtTheEnd(11);
        sll.insertAtTheEnd(8);
        sll.insertAtTheEnd(1);
        sll.insertAtTheEnd(10);

        sll.display();

        System.out.println(sll.deleteFirst().data);
        System.out.println(sll.deleteFirst().data);

        sll.display();

    }
}