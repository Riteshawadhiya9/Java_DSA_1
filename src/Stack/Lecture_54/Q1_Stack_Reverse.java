package Stack.Lecture_54;

import java.util.Scanner;
import java.util.Stack;

public class Q1_Stack_Reverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No.Of Elements");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" Elements");
        for(int i = 0 ; i < n ; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("Original Stack --> "+st);

        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
//            int x = st.peek();
//            rt.push(x);
//            st.pop();
            rt.push(st.pop());
        }
        System.out.println("Reversed Order --> "+rt);
    }
}
