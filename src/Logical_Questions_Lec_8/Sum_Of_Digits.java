// Find the sum of digits in a given number n...?
// Input : 12345
// Output: 15

package Logical_Questions_Lec_8;

import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter t ");
        int t = sc.nextInt();
        while(t-->0){
        System.out.print("Enter n : ");
            int n = sc.nextInt();
            int ans = 0;
            while(n > 0){
                ans = ans + n%10;
                n/=10;
            }
            System.out.println(ans);
        }

    }

}
