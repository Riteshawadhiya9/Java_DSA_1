package Strings_or_StringBuilders;

import java.util.Scanner;

public class Q_3_Reverse_Word_In_Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hii , I am Ritesh Awadhiya ";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans += sb;
                ans += " ";
//                sb= sb.delete(0,sb.length());
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
