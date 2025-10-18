package PracticeQues;

import java.util.Scanner;

public class Reverse_Word {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        String s = "Hii , I am Ritesh Awadhiya";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans += sb;
                ans += " ";
//                sb = sb.delete(i,sb.length());
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
