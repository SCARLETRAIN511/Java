package collection;

import java.util.LinkedList;
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Hero> ll = new LinkedList<Hero>();
        ll.addLast(new Hero("Hero1"));
        ll.addFirst(new Hero("HeroX"));

        System.out.println(ll.getFirst());
    }
}
