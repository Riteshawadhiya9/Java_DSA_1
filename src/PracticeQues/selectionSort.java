package PracticeQues;

import java.util.Scanner;

public class selectionSort {
    static void selection(int []arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            int min_idx = i;
            for(int j = i+1 ; j < n ; j++){
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
        int arr[] = {1,5,9,2,1,0};
        selection(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
