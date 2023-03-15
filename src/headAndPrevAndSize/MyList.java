package headAndPrevAndSize;

public class MyList {

    private Node head;
    private int size = 0;

    public MyList() {
    }

    public MyList(Node head) {
        this.head = head;
    }

    public int size() {
        return size;
    }

    public void addFirst(int x) {
        Node newNode = new Node(x, null, null);

        if (head == null) { // nếu danh sách rỗng, gán head bằng nút mới
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int x) {
        Node newNode = new Node(x, null, null); // tạo một nút mới với giá trị x, next là null và prev là null
        if (head == null) { // nếu danh sách rỗng, gán head bằng nút mới
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) { // tìm nút cuối cùng của danh sách
                current = current.next;
            }
            current.next = newNode; // gán next của nút cuối cùng bằng nút mới
            newNode.prev = current; // gán prev của nút mới bằng nút cuối cùng của danh sách
        }
        size++;
    }

    public Node removeFirst() {
        Node value = new Node();
        if (head == null) { // danh sách rỗng
            return head;
        } else {
            value = head; // lưu giá trị của nút đầu tiên
            head = head.next; // gán head bằng next của nút đầu tiên
            if (head != null) { // nếu danh sách không chỉ có một nút
                head.prev = null; // gán prev của nút tiếp theo bằng null
            }
        }
        if (size == 0) {
            size = 0;
        } else {
            size--;
        }
        return value;
    }

    public Node removeLast() {
        Node value = new Node();
        if (head == null) { // danh sách rỗng
            return null;
        } else if (head.next == null) { // danh sách chỉ có một nút
            value = head;
            head = null;
            return value;
        } else {
            Node current = head;
            while (current.next.next != null) { // tìm nút trước nút cuối cùng
                current = current.next;
            }
            value = current.next; // lưu giá trị của nút cuối cùng
            current.next = null; // gán next của nút trước nút cuối cùng bằng null
        }
        if (size == 0) {
            size = 0;
        } else {
            size--;
        }
        return value;
    }

    public int count() {
        return size;
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
