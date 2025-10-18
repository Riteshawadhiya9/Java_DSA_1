package Recursion;

import java.util.Scanner;

public class SumOfDigit {
    static int Sumofdigit(int n){
        // base case
        if(n>=0 && n<=9){
            return n;
        }
        // recursive work
        int ans = Sumofdigit(n/10);
        // self work
        return ans+n%10;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println(Sumofdigit(12345));
    }
}
