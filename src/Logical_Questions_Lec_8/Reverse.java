// Reverse the digits of a number..?

package Logical_Questions_Lec_8;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of test cases: ");
        int t = sc.nextInt();
        while(t-->0){
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            int ans = 0 ;
            while(n>0){
                ans = ans * 10 + n%10;
                n /= 10;
            }
            System.out.println("Reversed number : "+ans+"\n");
        }
    }
}
