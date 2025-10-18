package Searching_and_Shorting;

import java.util.Scanner;

public class BubbleSort_Optimal {
    static void bubbleSort(int []arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            boolean flag = false;
            for(int j = 0 ; j < n-i-1 ; j++ ){
                if(arr[j] > arr[j+1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(flag == false) return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
/*
SC = 0(1)
TC = WC = O(n^2)
     AC = (n^2)
     BC = (n)
Stable = yes
Inplace = yes
 */