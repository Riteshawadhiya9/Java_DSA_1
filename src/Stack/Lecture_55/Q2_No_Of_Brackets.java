package Stack.Lecture_55;
import java.util.*;
public class Q2_No_Of_Brackets {
    public static int noOfBrackets(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i = 0 ; i < n ; i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else{ // ch == ')'
                if(st.size() == 0) return -1;
                if(st.peek() == '(') st.pop();
            }
        }
        return st.size();
    }// Wrong

    public static int noOfBrackets2(String str){
        int open = 0, close = 0;
        int n = str.length();

        for(int i = 0 ; i < n ; i++){
            char ch = str.charAt(i);
            if(ch == '('){
                open++; // extra opening bracket
            }else{ // ch == ')'
                if(open > 0){
                    open--; // matched with an opening bracket
                }else{
                    close++; // extra closing bracket
                }
            }
        }
        // Total removals = unmatched '(' + unmatched ')'
        return open + close;
    } // right --> GPT

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Minimum No.Of brackets remove to balanced : "+noOfBrackets(str));
        System.out.println("Minimum No.Of brackets remove to balanced : "+noOfBrackets2(str));

    }
}
