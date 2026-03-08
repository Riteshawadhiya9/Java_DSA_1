package Stack.Lecture_55;

import java.util.Scanner;
import java.util.Stack;

public class Q9_LC_682_BasketBall_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        String [] arr = {"5","-2","4","C","D","9","+","+"};
        int ans = calPoints(arr);
        System.out.println(ans);
    }
    public static int calPoints(String[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            String s = arr[i];
            if(s.equals("C")) st.pop();
            else if(s.equals("D")) st.push(2 * st.peek());
            else if(s.equals("+")){
                int top = st.pop();
                int secTop = st.peek();
                int sum = top + secTop;
                st.push(top);
                st.push(sum);
            }
            else st.push(Integer.parseInt(s));
        }
        int sum = 0;
        while (!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}
