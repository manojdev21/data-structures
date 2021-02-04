package linkedlist;

public class LinkedList {

    public Node head;

    public void show() {

        if (head == null) {
            System.out.println(0);
            return;
        }
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);

    }

    public void insert(int data) {

        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = node;

    }

    public void insertAtStart(int data) {

        Node node = new Node(data);
        node.next = head;
        head = node;

    }

    public void insertAt(int index, int data) {

        Node node = new Node(data);
        Node n = head;
        if (index == 0) {
            insertAtStart(data);
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;

    }

    public void deleteAt(int index) {

        if (index == 0) head = head.next;
        Node n = head;
        Node tempNode = null;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        tempNode = n.next;
        n.next = tempNode.next;
        tempNode = null;

    }

}
