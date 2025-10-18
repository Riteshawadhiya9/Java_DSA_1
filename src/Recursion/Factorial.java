package Recursion;

import java.util.Scanner;

public class Factorial {
    static int fact(int n){
        // base case
        if(n==0){
            return 1;
        }
        // recursive work
        int smallAns = fact(n-1);
        // selfWork
        return smallAns*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(fact(5));
    }
}
