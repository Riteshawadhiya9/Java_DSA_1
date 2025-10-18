package Stack.Lecture_55;
import java.util.*;
public class Q3_LC_20_Valid_Parantheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input : ");
        String str = sc.nextLine();
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str){
        Stack <Character> st = new Stack<>();
        int n = str.length();
        for(int i = 0 ; i < n ; i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                char top = st.peek();
                if((ch == ')' && top == '(' || ch == '}' && top =='{' || ch == ']' && top == '[')){
                    st.pop();
                }else{
                    return  false;
                }
            }
        }
        if(st.size() > 0) return false;
        return true;
    }
}
