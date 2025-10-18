package Strings_or_StringBuilders;

import java.util.Scanner;

public class Q_4_String_Compression_L_C_443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "aaabbbbcdddeeee";
        int cnt = 1;
        String ans = "" + str.charAt(0);
        for(int i = 1 ; i < str.length() ; i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                cnt++;
            }else {
                if (cnt > 1) ans += cnt;
                cnt = 1;
                ans += curr;
            }
        }
        if(cnt > 1) ans += cnt;
        System.out.println(ans);
    }
}
