package Recursion;

import java.util.Scanner;

public class CountDigit {
    public static long count_Digit(long n){
        // base case
        if(n>= 0 && n<=9) return 1;
         return count_Digit(n/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a digit :");
        long n = sc.nextInt();
        System.out.println(count_Digit(n));
    }
}
