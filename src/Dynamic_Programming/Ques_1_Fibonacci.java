package Dynamic_Programming;

import java.util.*;

public class Ques_1_Fibonacci {

    static int[]dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        dp = new int[n+1];

        System.out.print("Fibonacci Series of "+n+" is : " );
        for(int i = 0 ; i <= n ; i++){
            System.out.print(fibo(i)+" ");
        }
    }

    private static int fibo(int n){
        if(n==0 || n== 1) return n;
        if(dp[n] != 0) return dp[n];
        int ans = fibo(n-1)+fibo(n-2);
        dp[n] = ans;
        return ans;
    }
}
