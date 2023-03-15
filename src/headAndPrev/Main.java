package headAndPrev;

public class Main {

    public static void main(String[] args) {
        MyList m = new MyList();
        m.addFirst(1);
        m.addFirst(2);
        m.addLast(5);
        m.addLast(7);
        m.removeFirst();
        m.removeLast();
        m.display();
        System.out.println(m.count());
        //Done
    }
}
