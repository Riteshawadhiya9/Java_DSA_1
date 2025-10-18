package Recursion;

import java.util.Scanner;

public class printTable {
    public static void print_table(int n , int i){
        // base case
        if( i > 10){
            return;
        }
        // self work
        System.out.println((n*i));
        // recursive work
        print_table(n,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Digit ");
        int n = sc.nextInt();
        print_table(n,1);

    }
}
