package linkedList.my.circularDoublyLinkedList;

public class DoublyCircularLinkedList {
    Node head;
    Node tail;
    int size;

    DoublyCircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void addLast(int value) {
        Node node = new Node(value);

        if (isEmpty()) {
            head = node;
            tail = node;
            size++;
            return;
        }

        node.next = head;
        tail.next = node;
        node.prev = tail;
        head.prev = node;
        tail = node;
        size++;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.value + " -> ");
                if (node.next != null) {
                    node = node.next;
                }
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public Node getNode(int index, boolean isForward) {
        Node temp = head;
        Node node = tail;
        if (isForward) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;

        } else {
            for (int i = 0; i < index; i++) {
                node = node.prev;
            }
            return node;
        }
    }

    public void deleteMiddle() {
        int index = (size % 2 == 0 ) ? ((size / 2)) : ((size / 2) + 1);
       // int index = size / 2;
        Node node = head;

        if (node == null) {
            System.out.println("list is empty!");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }

        if(size == 2) {
            System.out.println("list size must be minimum 3 for deleting the middle!");
            return;
        }

        for(int i = 1; i < index -1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        node.next.next.prev = node;
        size--;
    }

    public Node getNodeFromIndex(int index) {
        Node node = head;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}


