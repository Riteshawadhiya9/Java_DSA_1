package Searching_and_Shorting.Divide_and_Conquer;

import java.util.Scanner;

public class Quick_Sort {
    static void displayArray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int arr[] ,int st ,int end){
        int pivot = arr[st];
        int cnt = 0;   //element less than pivot
        for(int i = st+1 ; i<= end ; i++){
            if(arr[i] < pivot) {
                cnt++;
            }
        }
        int pivotIdx = st+cnt;
        swap(arr,st,pivotIdx);
        int i = st , j = end;
        while(i < pivotIdx && j > pivotIdx){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;

            if(i < pivotIdx && j > pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quickSort(int arr[] , int st , int end){
        // base case
        if(st >= end) return;

        //self work
        int pi = partition(arr,st,end);

        // Recursive Work
        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int [] arr = {7,9,2,1,0,4,12,16};
        System.out.println("Array before Sorting :");
        displayArray(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println("Array after Sorting");
        displayArray(arr);
    }
}
