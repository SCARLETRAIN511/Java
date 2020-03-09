package collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Hero> q = new LinkedList<Hero>();
        //指定hero类型（泛型）
        System.out.println("Initialize the queue");
        q.offer(new Hero("Hero1"));
        q.offer(new Hero("Hero2"));
        System.out.println(q.peek());
    }
}
