
package HeadAndSize;


public class MyList {
    private Node head;
    private int size = 0;

    public MyList() {
    }

    public MyList(Node head) {
        this.head = head;
    }
    
    public int size(){
        return size;
    }
    
    public void addFirst(int x){
        if(size == 0){
            head = new Node(x, null);
        } else {
            Node q = new Node(x, head);
            head = q;
        }
        size++;
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
        size++;
    }
    
    public void removeFirst() {
        if (size == 0) {
            head = null;
        } else {
            int value = head.info;
            head = head.next;
        }
        if(size == 0){
            size = 0;
        } else {
            size--;
        }
    }

    public void removeLast() {
        if (size == 0) {
            head = null;
        } else if(size == 1){
            head = null;
        } 
        else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            Node lastNode = current.next;
            lastNode = null;
            current.setNext(null);
        }
        
        if(size == 0){
            size = 0;
        } else {
            size--;
        }
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
