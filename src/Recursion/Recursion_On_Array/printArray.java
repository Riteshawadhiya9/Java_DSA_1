package Recursion.Recursion_On_Array;

import java.util.Scanner;

public class printArray {
    static void printArray(int []arr , int idx){
        // base case
        if(idx == arr.length){
            return;
        }
        //self Work
        System.out.print(arr[idx]+" ");
        // Recursive work
        printArray(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Array size :");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid size! Array size must be greater than 0 ");
            return;
        }
        int arr[] = new int[n];
        System.out.println("Enter "+n+" Elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements ");
        printArray(arr,0);
    }
}
