package LinkedList.Creating_a_LinkedList;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertLast(2);
        list.insert(12,2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
    }
}
