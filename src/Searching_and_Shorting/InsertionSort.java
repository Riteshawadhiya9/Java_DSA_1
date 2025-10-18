package Searching_and_Shorting;

import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int[]arr){
        int n = arr.length;
        for(int i = 1 ; i < n ;i++){
            int j = i;
            while(j >0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = {2,3,5,2,5,8};
        insertionSort(arr);
        for(int ans : arr){
            System.out.print(ans+" ");
        }
    }
}
