package linkedList.singlyLinkedList;

public class SinglyLinkedList {
    Node head;

    void display() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    int findLength() {

        Node current = head;
        if(head == null) {
            return 0;
        }
        int count = 0;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    void insertNodeAtTheBeginning(int data) {

        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void insertAtTheEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void insertTheGivenPosition(int data, int position)  {
        int length = findLength();
        if(position > findLength()) {
            System.out.print("position can not be found");
            return;
        }
        Node newNode = new Node(data);
        if(position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node previous = head;
            int count = 1;
            while(count < position - 1) {
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
    }

    void deleteHeadNode() {

    }
}
