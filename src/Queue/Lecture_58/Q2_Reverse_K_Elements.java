package Queue.Lecture_58;
import java.util.*;
public class Q2_Reverse_K_Elements {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println("Enter K Elements ");
        int k = sc.nextInt();
        int n = q.size();
        System.out.println("Original Queue : "+q);
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < k ; i++){
            st.push(q.remove());
        }
        while (st.size()>0){
            q.add(st.pop());
        }
        for(int i = 0 ;i < n-k ;i++){
            q.add(q.remove());
        }
        System.out.println("After Reversed "+k+" Elements : "+q);


    }
}
