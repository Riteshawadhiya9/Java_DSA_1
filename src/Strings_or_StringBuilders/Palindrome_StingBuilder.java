package Strings_or_StringBuilders;

import java.util.Scanner;

public class Palindrome_StingBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcdcba";
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String s = gtr + "" ; // Convert StringBuilder to String
        if(str.equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
