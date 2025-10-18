package Queue.Lecture_57;

import java.util.LinkedList;
import java.util.Queue;

public class Basic {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println("size " + q.size());
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.isEmpty());
        System.out.println("size " + q.size());
        System.out.println(q);
        q.remove() ;// ya q.poll() both are same
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println("peek() "+q.peek());// ya q.element() both are same
        System.out.println("element() "+q.element());
        System.out.println("size " + q.size());

    }
}
