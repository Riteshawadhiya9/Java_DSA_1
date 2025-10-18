package Stack.Lecture_54;

import java.util.Stack;

public class Q2_Copy_Stack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();              // 🔰 Original stack banaya
        st.push(1);                                     // ➕ Push 1
        st.push(2);                                     // ➕ Push 2
        st.push(3);                                     // ➕ Push 3
        st.push(4);                                     // ➕ Push 4
        st.push(5);                                     // ➕ Push 5
        System.out.println("Original Stack --> " + st); // 🖨️ Original stack print

        Stack<Integer> gt = new Stack<>();              // 📥 Temporary stack (reverse store karne ke liye)

        while (st.size() > 0) {                         // 🔁 Jab tak original stack empty na ho
            gt.push(st.pop());                          // 🔄 st se pop karo aur gt me push karo (reverse order me)
        }

        Stack<Integer> rt = new Stack<>();              // ✅ Final copy stack

        while (gt.size() > 0) {                         // 🔁 Jab tak temporary stack khali na ho
            rt.push(gt.pop());                          // 🔄 gt se pop karo aur rt me push karo (original order maintain)
        }

        System.out.println("Copy Stack --> " + rt);     // 🖨️ Copied stack print karo
    }
}
