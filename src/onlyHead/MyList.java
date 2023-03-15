package onlyHead;

public class MyList {

    private Node head;

    public MyList() {
    }

    public MyList(Node head) {
        this.head = head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int x) {
        if (head == null) {
//            Node head = new Node(x, null);
            head = new Node(x, null);
        } else {
            Node q = new Node(x, head);
            head = q;
        }
    }

    public void addLast(int x) {
        Node newest = new Node(x, null);
        if (head == null) {
            head = new Node(x, null);
        } else {
            Node current = head;
            while (current.next != null) { // tìm nút cuối cùng của danh sách
                current = current.next;
            }
            current.next = newest;
            newest.next = null;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            head = null;
        } else {
            int value = head.info;
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            head = null;
        } else if (head.next == null) {
            head = null;

        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            Node lastNode = current.next;
            lastNode = null;
            current.setNext(null);
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
