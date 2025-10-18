package Recursion;

import java.util.Scanner;

public class print_K_Multiples {
    public static void printMultiples(int n , int k){
        // base case
        if(k == 1){
            System.out.println(n);
            return;
        }

        // recursive work
        printMultiples(n , k-1);

        // self work
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int nums = sc.nextInt();
        int k = sc.nextInt();
        printMultiples(nums,k);
    }
}
