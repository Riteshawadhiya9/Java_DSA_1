package Searching_and_Shorting;

import java.util.Scanner;

public class BubbleSort_BruteForce {
    static void bubbleSort(int [] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return;
    }
    static void bubbleSort_2(int []arr){
        int n = arr.length ;
        for(int  i =0 ; i < n-1 ;i++){
            for(int j =0 ; j < n-i-1 ; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements :");
        int []arr = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println("After Sorting ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort_2(arr);
        System.out.println("After Sorting ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
/*
SC = 0(1)
TC = WC = O(n^2)
     AC = (n^2)
     BC = (n^2)
Stable = yes
Inplace = yes
 */
