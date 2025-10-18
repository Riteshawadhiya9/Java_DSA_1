package Recursion.Recursion_on_String;

import java.util.Scanner;

public class palindrome {
    static boolean isPalindrome(String s , int l ,int r){
        if(l>=r){
            return true;
        }
        return (s.charAt(l) == s.charAt(r) && isPalindrome(s,l+1,r-1));
    }
    static String isPalindromeRec(String s ){
        // base case
        if( s.length() == 0) return "";
        String ans = isPalindromeRec(s.substring(1));
        return ans + s.charAt(0);
    }

    public static String ipallindrome(String s){
        String rev = "";
        for(int i = s.length() -1 ;i>= 0 ; i--){
            rev += s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
//        String ans = ipallindrome(s);

//        String ans1 = isPalindromeRec(s);
//        if(ans1.equals(s)){
//            System.out.printf("%s is palindrome" ,s);
//        }else{
//            System.out.printf("%s is not palindrome ",s);
//        }

        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}
