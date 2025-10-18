package Stack.Lecture_56;
import java.util.*;
public class Q1_Infix_Expression {
    public static void main(String[] args) {
        String str = "9-5+3*4/6"; // Ye infix expression h jise hume evaluate karna hai
        Stack<Integer> val = new Stack<>(); // Numbers (operands) ke liye stack
        Stack<Character> op = new Stack<>(); // Operators ke liye stack (+,-,*,/)

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i); // Current character nikala
            int ascii = (int)ch; // Character ka ASCII value nikala (digit check karne ke liye)

            // Agar digit hai (0-9 ke beech me)
            if(ascii >= 48 && ascii <= 57){
                val.push(ascii-48); // Char ko number me convert karke push kar diya (e.g. '5'->5)
            }
            // Agar operator stack khali hai toh directly operator push kar do
            else if(op.size() == 0){
                op.push(ch);
            }
            else{
                // Agar current operator '+' ya '-' hai toh pahle purana operation solve karna hoga
                if(ch == '+' || ch == '-'){
                    // Kaam karo (2 values nikalo aur operator apply karo)
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '-') val.push(v1-v2);
                    if(op.peek() == '+') val.push(v1+v2);
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);
                    op.pop(); // purana operator hata do

                    // Ab current operator push kar do
                    op.push(ch);
                }
                else{
                    // Agar current operator '*' ya '/' hai
                    if(ch == '*' || ch == '/'){
                        // Check karo ki stack top me bhi '*' ya '/' hai
                        if(op.peek() == '*' || op.peek() == '/'){
                            // Pahle top operator solve karo
                            int v2 = val.pop();
                            int v1 = val.pop();
                            if(op.peek() == '*') val.push(v1*v2);
                            if(op.peek() == '/') val.push(v1/v2);
                            op.pop();
                            // Ab current operator push karo
                            op.push(ch);
                        }
                        else op.push(ch); // Agar top me '+' ya '-' hai toh directly push kar do
                    }
                }
            }
        }

        // Loop ke baad agar abhi bhi multiple values bachi hain toh unhe solve karo
        while(val.size() >1){
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek() == '+') val.push(v1+v2);
            if(op.peek() == '-') val.push(v1-v2);
            if(op.peek() == '*') val.push(v1*v2);
            if(op.peek() == '/') val.push(v1/v2);
            op.pop();
        }

        // Final answer print kar do
        System.out.println("After solving the given expression => "+val.peek());
    }
}
