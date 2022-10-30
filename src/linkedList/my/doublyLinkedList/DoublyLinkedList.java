package linkedList.my.doublyLinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int length() {
        return size;
    }

    public Node getNode(int index) {
        Node node = head;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if(isEmpty()) {
            tail = newNode;
            head = newNode;

        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
        size++;
    }

    public void insert(int index, int value) {
        Node newNode = new Node(value);

        if(index == 0) {
            addFirst(value);
            return;
        }

        Node prev = getNode(index-1);
        newNode.next = prev.next;
        prev.next.prev = newNode;
        newNode.prev = prev;
        prev.next = newNode;
        size++;
    }

    public void deleteFirst() {
        if(isEmpty()) {
            System.out.println("list is empty!!");
            return;
        }

        if(size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteLast() {
        if(isEmpty()) {
            System.out.println("list is empty!!");
            return;
        }

        if(size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }

       tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void swapWithNext(int index) {
    Node p = getNode(index);
    Node beforep = p.prev;
    Node afterp = p.next;

    p.next = afterp.next;
    afterp.next = p;
    p.prev = afterp;
    afterp.next.prev = p;
    afterp.prev = beforep;
    beforep.next = afterp;
       // p.next = afterp.next;
       // afterp.next.prev = p;
        //afterp.next = p;
       // afterp.prev = beforep;
       // beforep.next = afterp;
       // p.prev = afterp;

    }

    public void printForward() {
        if(isEmpty()) {
            System.out.println("list is empty");
            return;
        }
        Node node = head;
        while(node != null) {
            System.out.print(node.value + " --> ");
            node = node.next;
        }
        System.out.println("NULL");
    }

    public void printBackward() {
        if(isEmpty()) {
            System.out.println("list is empty");
            return;
        }

        Node last = tail;
        System.out.println("reversed list: ");
        while(last != null) {
            System.out.print(last.value + " --> ");
            last = last.prev;
        }
        System.out.println("NULL");
    }
}
