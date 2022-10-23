package linkedList.doublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void insertAtTheBeginning(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            //head = newNode;
            tail = newNode;
        } else {
            head.previous = newNode;
        }
            newNode.next = head;
            head = newNode;
            length++;
        }



    public void printList() {
        if(head == null) {
            System.out.print("list is empty!");
            return;
        }
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void printListReversed() {
        if(head == null) {
            System.out.print("there is no tail!");
            return;
        }
        Node current = tail;
        while(current != null) {
            System.out.print(current.data + "-->");
            current = current.previous;
        }
        System.out.print("null");
    }
}
