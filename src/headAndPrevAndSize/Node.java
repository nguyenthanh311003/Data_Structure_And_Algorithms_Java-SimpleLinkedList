
package headAndPrevAndSize;

import headAndTailAndPrev.*;
import headAndPrev.*;
import HeadAndTail.*;


public class Node {
    int info;
    Node prev;
    Node next;

    Node() {
    }

    Node(int x, Node p, Node q) {
        info = x;
        prev = p;
        next = q;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
