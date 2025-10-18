package Recursion.Recursion_On_Array;

import java.util.Scanner;

public class Find_Max_Value {
    static int printmax(int [] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallAns = printmax(arr , idx+1);

        return Math.max(arr[idx],smallAns);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = {2,3,5,10,2,4,6,9};
         int ans = printmax(arr,0);
        System.out.println("Maximum element in a given array : "+ ans);
    }
}
