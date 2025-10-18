package Recursion.Recursion_on_String;

import java.util.Scanner;

public class Reverse {

    static String reverse(String s){
        if(s.length() == 0) return "";
        String smallAns = reverse(s.substring(1));
        return smallAns+s.charAt(0);
    }
    static String recReverse(String s , int idx){
        //base case
        if(idx == s.length()) return "";
        // recursive work
        String smallAns = recReverse(s, idx+1);
        // selfwork
        return smallAns+s.charAt(idx);
    }

    public static String iReverse(String s){
        String rev = "";
        for(int i = s.length() -1 ; i >= 0 ; i--) {
            rev += s.charAt(i);
        }
    return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        System.out.println(iReverse(s));
        System.out.println(recReverse(s,0));
        System.out.println(reverse(s));
    }
}
