package Recursion;

import java.util.Scanner;

public class print_Multiple {
    public static void printMultiple(int n , int k){
        // base case
        if(k == 1){
            System.out.println(n);
            return ;
        }
        // recursive work
        printMultiple(n , k -1);
        //  self work
        System.out.println(n * k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        printMultiple(3 , 5);
    }
}
