package Strings_or_StringBuilders;

import java.util.Scanner;

public class print_SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Give Input as a String ");
        String s = sc.nextLine();
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i+1 ; j <= s.length() ; j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }
}
