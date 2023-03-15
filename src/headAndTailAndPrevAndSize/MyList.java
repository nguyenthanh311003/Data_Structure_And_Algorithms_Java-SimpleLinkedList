package headAndTailAndPrevAndSize;

import headAndTailAndPrev.*;

public class MyList {

    private Node head, tail;
    private int size = 0;

    public MyList() {
    }

    public MyList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public void addFirst(int x) {
        Node newNode = new Node(x, null, null);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int x) {
        Node newNode = new Node(x, null, null);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }
        Node temporaryNode = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = temporaryNode.next;
            head.prev = null;
        }
        if (size == 0) {
            size = 0;
        } else {
            size--;
        }
    }

    public void removeLast() {
        if (tail == null) {
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            Node temporaryNode = tail;
            tail = temporaryNode.prev;
            tail.next = null;
        }
        if (size == 0) {
            size = 0;
        } else {
            size--;
        }
    }

    public int count() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void display() {
        if (head == null) {
            System.out.println("Danh sách rỗng.");
            return;
        }
        Node current = head;
        System.out.print("Danh sách liên kết đôi: ");
        while (current != null) {
            System.out.print(current.info + " ");
            current = current.next;
        }
        System.out.println();
    }

}
