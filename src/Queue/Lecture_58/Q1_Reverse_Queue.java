package Queue.Lecture_58;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Q1_Reverse_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("Original Queue : "+q);
        Stack<Integer> st = new Stack<>();
        while (q.size() > 0){
            st.push(q.remove());
        }
        while (st.size()>0){
            q.add(st.pop());
        }
        System.out.println("Reversed Queue : "+q);
    }
}

