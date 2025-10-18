package Stack.Lecture_54;
import java.util.Stack;
public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st); // []
        System.out.println(st.size()); // 0
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        System.out.println(st); // [12, 13, 14, 15]
        System.out.println(st.peek());//15
        System.out.println(st.size());//4
        st.pop();
        System.out.println(st); //[12, 13, 14]
        st.pop();
        System.out.println(st); // [12, 13]
        System.out.println(st.size()); // 2
    }
}
