package Recursion.Recursion_On_Array;

import java.util.Scanner;

public class linearSearch {
    static int findLastOccurance(int[] arr , int target ,int idx){
//        // base case
//        if(idx == arr.length) return -1;
//        // recursive work
//        int smallAns = findLastOccurance(arr,target,idx+1);
//        // self work
//        if(smallAns != -1){
//            return smallAns;
//        }
//        return (arr[idx] == target) ? idx : -1;

        // base case
        if(idx == -1) return -1;
        //self work
        if(arr[idx] == target) return idx;
        // recursive work
        return findLastOccurance(arr,target,idx-1);
    }

    static int findIndex_FirstOccurance(int [] arr , int target ,int idx){
        // base case
        if(idx == arr.length){
            return -1;
        }
        // self work
        if(arr[idx] == target){
            return idx;
        }
        // recursive work
        return findIndex_FirstOccurance(arr,target,idx+1);
    }

    static boolean search(int [] arr ,int target , int idx){
        // base case
        if(idx == arr.length) return false;
        // self work
        if(arr[idx] == target) return true;
        // recursive work
         return search(arr,target,idx+1);
//        boolean smallAns = search(arr,target,idx+1);
//        if(smallAns){
//            return true;
//        }else{
//            return false;
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements :");
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target : ");
         int target = sc.nextInt();
//         if(search(arr,target,0)){
//             System.out.println("Found");
//         }else{
//             System.out.println("Not Found");
//         }


//        int ans = findIndex_FirstOccurance(arr,target,0);
//        if(ans>0) {
//            System.out.println("Target at Index : " + ans);
//        }else{
//            System.out.println("Target is not present ");
//        }

//        int ans = findLastOccurance(arr,target,0); // for 1st approach
        int ans = findLastOccurance(arr,target,arr.length-1); // for 2nd approach
        if(ans>0) {
            System.out.println("Target at Index : " + ans);
        }else{
            System.out.println("Target is not present ");
        }


    }
}
