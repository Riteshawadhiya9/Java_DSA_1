package Collection_FrameWork.Lecture_59.List_Interface;
import java.util.*;
public class stack {
    static void stackExample(){
        Stack<String> st = new Stack();
        st.push("Ritesh");
        st.push("Awadhiya");
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.size());
        st.push("Aarushi");
        st.push("Kratika");
        System.out.println(st.size());
        System.out.println(st);
    }

    public static void main(String[] args) {
        stackExample();
    }
}
