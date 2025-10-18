/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

package Leetcode_Problems;
import java.util.*;
public class Leetcode_70 {
    public static int solution(int n){
        if(n <= 3){
            return n;
        }
        int a = 3 ,b = 2;
        for(int i = 0 ; i < n-3 ; i++){
            a = a+b;
            b = a-b;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter no. of  steps : ");
        int n = sc.nextInt();
        // int ans = solution(n);
        System.out.println("Total Steps : "+solution(n));
    }
}
