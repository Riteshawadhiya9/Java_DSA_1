package Strings_or_StringBuilders;

import java.util.Scanner;

public class Q_3_Reverse_Word_In_Sentence {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = "I am an educator";
       String ans = "";
       StringBuilder sb = new StringBuilder("");
       for(int i = 0 ; i < s.length() ; i++) {
           char ch = s.charAt(i);
           if (ch != ' ') {
               sb.append(ch);
           } else {
               sb.reverse();
               ans += sb;
               ans += " ";
               sb = new StringBuilder("");
           }
       }
           sb.reverse();
           ans += sb;
           System.out.println(ans);
    }
}
