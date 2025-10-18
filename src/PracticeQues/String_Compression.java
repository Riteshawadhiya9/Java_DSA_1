package PracticeQues;

import java.util.Scanner;

public class String_Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = "aaabbbssddwiieee";
        String ans = "" + s.charAt(0);
        int cnt = 1;
        for(int i = 1 ; i < s.length() ; i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if(curr == prev){
                cnt++;
            }else{
                if(cnt > 1) ans += cnt;
                cnt = 1;
                ans += curr;
            }
        }
        if(cnt > 1) ans += cnt;
        System.out.println(ans);
    }
}
