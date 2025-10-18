package PracticeQues;

import java.util.Scanner;

public class Palindrome_Count {

    static  boolean isPalindrome(String s){
        int i = 0 ;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i+1 ; j <= s.length() ; j++){
                if(isPalindrome(s.substring(i,j))==true){
                    System.out.print(s.substring(i,j)+" ");
                    cnt++;
                }
            }
        }
        System.out.println("\nTotal No.Of Palindromic Count is : "+cnt);
    }
}
