package Binary_Search_Algorithm.Lecture_45;

import java.util.Scanner;

public class Linear_search {
    static void display (int []arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    static boolean recBinarySearch(int arr[] ,int st , int end , int target){
        if(st > end) return false;
        int mid = st + (end - st)/2;
        if(target == arr[mid]) return true;
        else if(target < arr[mid]){
            return recBinarySearch(arr, st, mid-1 , target);
        }else{
            return recBinarySearch(arr, mid+1 ,end ,target);
        }
    }
    static int binarySearch(int[]arr,int target){
        int st = 0;
        int end = arr.length-1;
        while (st <= end) {
        int mid = (st+end)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) {
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arr = {2,4,5,7,12,34,211,245};
        display(arr);
//        System.out.println("Enter Target");
        int target = 21;
//        int ans = binarySearch(arr,target);
//        if(ans != -1){
//            System.out.println("Found at index "+ ans);
//        }else{
//            System.out.println("Not Found");
//        }
        System.out.println(recBinarySearch(arr,0,arr.length-1,target));
    }
}
