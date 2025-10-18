//package Logical_Questions_Lec_8;
//import java.util.*;
//public class Factorial {
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner (System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//        int fact = 1 ;
//        for(int i = 1 ; i <= n ;i++){
//            fact = fact * i;
//            System.out.println(fact);
//        }
//    }
//}


package Logical_Questions_Lec_8;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input the value of n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int fact = 1;

        // Calculate factorial and display intermediate results
        System.out.println("Calculating factorial...");
        for (int i = 1; i <= n; i++) {
            fact *= i; // Multiply fact by i
            System.out.printf("Factorial after multiplying by %d: %d%n", i, fact);
        }

        // Display the final factorial result
        System.out.printf("The factorial of %d is: %d%n", n, fact);

        // Close the scanner
        sc.close();
    }
}
