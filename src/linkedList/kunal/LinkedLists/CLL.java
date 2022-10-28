package linkedList.kunal.LinkedLists;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if(head == null) {
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
        if(head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while(node != head);
            System.out.println("HEAD");
        } else {
            System.out.println("list is empty");
        }
    }

    public void deleteHead() {
          if(head == null) {
              System.out.println("list is empty");
              return;
          } else {
              head = head.next;
              tail.next = head;
          }
    }

    public void deleteValue(int value) {
        Node node = head;
        if(node == null) {
            System.out.println("list is empty");
            return;
        }

        if(node.val == value) {
           head = tail.next;
           tail.next = head;
           return;
        }

        do {
            Node n = node.next;
            if(n.val == value) {
                node.next = n.next;
                break;
            }
            node = node.next;

        } while (node != head);
        System.out.println("value is not found!");
    }
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
