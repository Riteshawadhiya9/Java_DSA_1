package Recursion.Recursion_On_Array;

import java.util.Scanner;

public class Sum_Of_All_Elements {
    static int sumOfArray(int[] arr , int idx){
        if(idx == arr.length -1){
            return arr[idx ];
        }
        int smallAns = sumOfArray(arr,idx+1);
        return smallAns+arr[idx];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = {1,2,3,4,5};

        int ans = sumOfArray(arr,0);
        System.out.println("Sum Of All Elements in a given Array : "+ ans);
    }
}
