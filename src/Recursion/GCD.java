package Recursion;

import java.util.Scanner;

public class GCD {
    static int iGCD(int x , int y){
        while(x%y != 0){
            int rem = x%y;
            x = y;
            y =rem;
        }
        return y;
    }

    static int rGCD(int x , int y){
        // base case
        if(y == 0){
            return x;
        }
        return rGCD(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(iGCD(x,y));
        System.out.println(rGCD(x,y));
    }
}
