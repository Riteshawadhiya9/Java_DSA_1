package Searching_and_Shorting.Divide_and_Conquer;

import java.util.Scanner;

public class Merge_Sort {
    static void displayArray(int [] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void merge(int [] arr , int l ,int mid , int r){
        int n1 = mid - l+1;
        int n2 = r-mid;
        int [] left = new int[n1];
        int [] right = new int[n2];
        int i;
        int j;
        int k;
        for(i = 0 ; i < n1 ; i++){
            left[i] = arr[l+i];
        }
        for(j = 0 ; j < n2 ; j++){
            right[j] = arr[mid+1+j];
        }

        i=0;
        j=0;
        k=l;
         while(i<n1 && j < n2){
             if(left[i] <= right[j]){ // <= for ascending order || >=  for descending order
                 arr[k++] = left[i++];
             }else{
                 arr[k++] = right[j++];
             }
         }
         while(i<n1){
             arr[k++] = left[i++];
         }
         while(j<n2){
             arr[k++] = right[j++];
         }
    }
     static void mergeSort(int[] arr , int l ,int r){
        // base case
         if(l>=r) return ;
         int mid = (l+r)/2;
         //Recursive Work
         mergeSort(arr,l,mid);
         mergeSort(arr,mid+1,r);
         // Self Work
         merge(arr,l,mid,r);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[]nums = {7,0,0,6,5,4,3,1,2,0};
        int n = nums.length;
        System.out.println("Array before Sorting ");
        displayArray(nums);
        mergeSort(nums,0,n-1);
        System.out.println("Array After Sorting ");
        displayArray(nums);
    }
}
