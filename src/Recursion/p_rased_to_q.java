package Recursion;

import java.util.Scanner;

public class p_rased_to_q {
    public static int power(int p , int q){
        // base case
        if(q == 0){
            return 1;
        }
        // recursive work
        int smallAns = power(p ,q-1);
        // selfwork
        return smallAns*p;
    }

    public static int power2(int p , int q){
        if(q == 0){
            return 1;
        }
        if(q%2==0){
            int smallAns = power(p , q/2);
            return smallAns * smallAns;
        }
        int smallAns = power(p , q/2);
        return smallAns * smallAns * p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         int result = power(2 ,3);
        System.out.println(result);
        System.out.println(power2(2,3));
    }
}
