package Stack.Lecture_54;

import java.util.Scanner;
import java.util.Stack;

public class Q5_Remove_At {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Enter which idx is remove: ");
        int idx = sc.nextInt();
        Stack<Integer> rt = new Stack<>();
        while(st.size() > idx){
            rt.push(st.pop());
        }
        st.pop();
        while (rt.size() > 0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
