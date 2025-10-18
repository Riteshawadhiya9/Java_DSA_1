package Recursion;

import java.util.Scanner;

public class Fibbonachi {
    static int fibb(int n){
        // base case
        if(n==0 || n ==1){
            return n;
        }
        // recursive work
        int smallAns = fibb(n-1);
        int smallAns1 = fibb(n-2);
        // self work
        return smallAns + smallAns1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
         for(int i = 0 ; i < n ; i++ ){
             System.out.println(fibb(i));
         }
    }
}
