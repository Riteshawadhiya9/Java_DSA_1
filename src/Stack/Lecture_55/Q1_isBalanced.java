package Stack.Lecture_55;
import  java.util.*;
public class Q1_isBalanced {
    public static boolean isBalaced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i = 0 ; i< n ;i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else{ // ch == ')'
                if(st.size() == 0) return  false;
                if(st.peek() == '(') st.pop();
            }
        }
        if(st.size() > 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Input Brackets : ");
        String str = sc.nextLine();
        System.out.println(isBalaced(str));
    }
}
