package Recursion;

import java.util.Scanner;

public class Alternate_sign {
    static int digitSum(int n ){
        // base case
        if(n==1){
            return  1;
        }
//        int smallAns = digitSum(n-1);
//        return n + smallAns;
        return   n + digitSum(n-1) ;// Addition Follow Commutative law = A+B = B+A
    }
    static int alternateSum(int n){
        if(n == 1) return 1;
        if(n%2 == 0){
            return alternateSum(n-1)-n;
        }else{
            return alternateSum(n-1)+n;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int result= digitSum(n);
        System.out.println(result);
        //System.out.println(alternateSum(10));
    }
}
