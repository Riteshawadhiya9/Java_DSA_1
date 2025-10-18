package Leetcode_Problems;

import java.util.Scanner;

public class Leetcode_3151 {
    public static void printArray(int [] arr){
        int n = arr.length;
        for(int i =0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static boolean solution(int [] arr){
        int n = arr.length;
        if(n == 1){
            return true;
        }
        for(int i = 1 ; i < n-1 ; i++){
            if((arr[i] - arr[i-1])%2==0){
                return false ;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array");
        printArray(arr);
         boolean ans = solution(arr);
        System.out.println(ans);

    }
}
