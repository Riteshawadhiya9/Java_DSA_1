package Recursion;

import java.util.Scanner;

public class printDecreasing {
    static  void printDecreasing( int x){
        if(x == 1){
            System.out.println(1);
            return ;
        }
        System.out.println(x);
        printDecreasing(x-1);
    }
    public static void printDecreasing_2(int n){
        // base case
        if(n==50){
            System.out.println(n);
            return;
        }
        // recursive work
        printDecreasing_2(n+1);
        // self work
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printDecreasing(x);// isme input last element(5) dena hoga
       // printDecreasing_2(x);// isme input first element(1) dena hoga
    }
}
