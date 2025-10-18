package Searching_and_Shorting;

import java.util.Scanner;

public class SelectionSort_Optimal {
    static void selectionSort(int [] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            int min_idx = i;
            for(int j = i+1 ; j < n ;j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {9,5,3,2,4,0};
        selectionSort(arr);
        for(int ans : arr){
            System.out.print(ans+" ");
        }
    }
}
/*
SC = 0(1)
TC = WC = O(n^2)
     AC = (n^2)
     BC = (n^2)
Stable = NO
Inplace = yes
 */