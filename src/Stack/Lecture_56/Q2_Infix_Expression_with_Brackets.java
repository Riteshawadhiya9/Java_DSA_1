package Stack.Lecture_56;

import java.util.Stack;

public class Q2_Infix_Expression_with_Brackets {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6"; // Infix expression with brackets
        Stack<Integer> val = new Stack<>(); // Numbers (operands) ke liye stack
        Stack<Character> op = new Stack<>(); // Operators (+,-,*,/,() ) ke liye stack

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Current character nikala
            int ascii = (int) ch;    // ASCII nikala (digit check karne ke liye)

            // Agar digit hai (0-9 ke beech me)
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48); // Char ko number me convert karke push kar do
            }
            // Agar stack empty hai ya '(' mila hai toh directly push kar do
            else if (op.size() == 0 || ch == '(' || op.peek() =='(') {
                op.push(ch);
            }
            // Agar ')' mila toh '(' tak solve karna hoga
            else if(ch ==')'){
                while (op.peek() != '('){
                    // 2 values nikalo aur operator apply karo
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '-') val.push(v1 - v2);
                    if (op.peek() == '+') val.push(v1 + v2);
                    if (op.peek() == '*') val.push(v1 * v2);
                    if (op.peek() == '/') val.push(v1 / v2);
                    op.pop(); // operator hataya
                }
                op.pop(); // '(' ko bhi remove kar do
            }
            // Agar operator mila (+,-,*,/)
            else {
                // Agar '+' ya '-' hai toh pahle purana operator solve karo
                if (ch == '+' || ch == '-') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '-') val.push(v1 - v2);
                    if (op.peek() == '+') val.push(v1 + v2);
                    if (op.peek() == '*') val.push(v1 * v2);
                    if (op.peek() == '/') val.push(v1 / v2);
                    op.pop(); // purana operator hata do

                    // Ab current operator push kar do
                    op.push(ch);
                } else {
                    // Agar '*' ya '/' mila
                    if (ch == '*' || ch == '/') {
                        // Agar top me bhi '*' ya '/' hai toh usse pehle solve karo
                        if (op.peek() == '*' || op.peek() == '/') {
                            int v2 = val.pop();
                            int v1 = val.pop();
                            if (op.peek() == '*') val.push(v1 * v2);
                            if (op.peek() == '/') val.push(v1 / v2);
                            op.pop();
                            // Ab current operator push kar do
                            op.push(ch);
                        } else op.push(ch); // Agar top me '+' ya '-' hai toh directly push kar do
                    }
                }
            }
        }

        // Loop ke baad agar operators bache hain toh unhe bhi solve karo
        while (val.size() > 1) {
            int v2 = val.pop();
            int v1 = val.pop();
            if (op.peek() == '+') val.push(v1 + v2);
            if (op.peek() == '-') val.push(v1 - v2);
            if (op.peek() == '*') val.push(v1 * v2);
            if (op.peek() == '/') val.push(v1 / v2);
            op.pop();
        }

        // Final result
        System.out.println("After solving the given expression => " + val.peek());
    }
}
