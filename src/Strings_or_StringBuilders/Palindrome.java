package Strings_or_StringBuilders;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = "abcdcba";
        int i = 0 ;
        int j = str.length()-1;
        boolean flag = true;
        while (i < j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }
}
