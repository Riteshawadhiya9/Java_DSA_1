package Stack.Lecture_56;
import java.util.*;

public class Q3_Infix_to_Prefix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6"; // Infix expression diya hua
        System.out.println(infix);

        Stack<String> val = new Stack<>(); // Operand (numbers ya sub-expressions) ke liye stack
        Stack<Character> op = new Stack<>(); // Operators ke liye stack (+,-,*,/,())

        // Expression ko left to right traverse karenge
        for(int i = 0 ; i < infix.length() ; i++){
            char ch = infix.charAt(i); // Current character nikala
            int ascii = (int)ch;       // ASCII nikala (digit check ke liye)

            // Agar digit hai (0-9 ke beech)
            if(ascii>=48 && ascii<=57){
                String s = ""+ch;   // Char ko String me convert kiya
                val.push(s);        // Stack me push kar diya
            }
            // Agar stack empty hai ya '(' mila hai toh directly push kar do
            else if(op.size()==0 || ch =='(' || op.peek()=='('){
                op.push(ch);
            }
            // Agar ')' mila toh '(' tak ke saare operations solve kar do
            else if(ch ==')'){
                while(op.peek()!= '('){
                    // Ek operator nikal ke do operands ke sath prefix banao
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o+v1+v2; // Prefix form me jod diya (op + left + right)
                    val.push(t);
                }
                op.pop(); // '(' ko bhi hata do
            }
            // Agar operator mila (+, -, *, /)
            else {
                // Agar '+' ya '-' mila toh directly purana operator solve karo
                if(ch == '+' || ch =='-'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o+v1+v2; // Prefix form
                    val.push(t);
                    // Ab current operator push karo
                    op.push(ch);
                }
                // Agar '*' ya '/' mila
                if(ch =='*' || ch =='/'){
                    // Agar top of stack bhi '*' ya '/' hai toh pahle solve karo
                    if(op.peek() == '*' || op.peek() =='/') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o+v1+v2;
                        val.push(t);
                        // Ab current operator push karo
                        op.push(ch);
                    }
                    // Agar top me '+' ya '-' hai toh directly push kar do
                    else op.push(ch);
                }
            }
        }

        // Jab tak ek hi value nahi bachi, solve karte raho
        while(val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o+v1+v2; // Prefix form
            val.push(t);
        }

        // Final result (prefix expression)
        String prefix = val.pop();
        System.out.println(prefix);
    }
}
