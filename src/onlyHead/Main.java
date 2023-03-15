package onlyHead;

import HeadAndTail.*;

public class Main {

    public static void main(String[] args) {
        MyList m = new MyList();
            m.removeFirst();
            m.addFirst(1);
            m.addFirst(2);
            m.addLast(0);
            m.addLast(5);
            m.addLast(6);
            m.removeLast();
            m.removeLast();
            m.display();
            //done
    }
}
