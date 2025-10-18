package Stack.Lecture_54;

import java.util.Stack;

public class Q3_InsertionAt_Any_Index {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();              // 🔰 Original stack banaya
        st.push(1);                                     // ➕ Push 1
        st.push(2);                                     // ➕ Push 2
        st.push(3);                                     // ➕ Push 3
        st.push(4);                                     // ➕ Push 4
        st.push(5);                                     // ➕ Push 5
        System.out.println("Original Stack --> " + st);
        int idx = 2;
        int val = 7;
        Stack<Integer> temp = new Stack<>();
        while(st.size() > idx){
            temp.push(st.pop());
        }
        st.push(val);
        while(temp.size() > 0){
            st.push(temp.pop());
        }
        System.out.println("After Insertion --> "+st);
    }
}
