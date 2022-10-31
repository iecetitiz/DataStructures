package linkedList.my.circularSinglyLinkedList;

public class singlyCircularLinkedList {
    private Node head;
    private Node tail;

    public singlyCircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
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

    public void deleteGivenValue(int val) {
        Node node = head;
        if (node == null) {
            System.out.println("list is empty!");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }
}
