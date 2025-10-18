package Collection_FrameWork.Lecture_59.List_Interface.Queue;
import java.util.*;
public class Queue_Interface {
    static void queueExample(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);
    }
    public static void main(String[] args) {
        queueExample();
    }
}
