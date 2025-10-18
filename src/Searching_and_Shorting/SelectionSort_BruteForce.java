package Searching_and_Shorting;

import java.util.Scanner;

public class SelectionSort_BruteForce {
    static int findMin(int [] arr){
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = {2,3,2,1,4,3};


    }
}
