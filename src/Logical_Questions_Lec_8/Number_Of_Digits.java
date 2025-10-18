// Counts the number of digits for a given number n ..?

package Logical_Questions_Lec_8;

import java.util.Scanner;

public class Number_Of_Digits {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter Number : ");
        long n = sc.nextInt();

        int NumOfDigits = 0;
        while(n > 0){
            n /= 10;
            NumOfDigits++;
        }

        System.out.println(NumOfDigits);
    }
}
