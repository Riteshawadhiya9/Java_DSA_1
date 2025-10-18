/*
Find the sum of the following series..
    s = 1-2+3-4+5-6......n
 */

package Logical_Questions_Lec_8;

import java.util.Scanner;

public class Sum_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i; // Subtract if the number is even
            } else {
                sum += i; // Add if the number is odd
            }
        }

        System.out.printf("The sum of the series for n = %d is: %d%n ", n, sum);

    }
}

