package Binary_Search_Algorithm.Lecture_46;

import java.util.Scanner;

public class Q_1_Find_Minimum {
    static int findMin(int arr[]){ // Brute Force
        int n = arr.length;
        if(arr[0] <= arr[n-1]){
            return 0;
        }
        for(int i = 1 ; i < n ; i++){
            if(arr[i-1] > arr[i]){
                return i;
            }
        }
        return 0;
    }
    static int findMinimum(int[]arr){ // Optimal
        int st = 0;
        int end = arr.length-1;
        int ans = -1;
        int n = arr.length;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] > arr[n-1]){
                st = mid+1;
            }else if(arr[mid] <= arr[n-1]){
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int []arr = new int[] {9,10,11,12,0,1,2,3,4,5,6,7,8};
        System.out.println( "Minimum element at index : "+ findMinimum(arr));
        System.out.println( "Minimum element at index : "+ findMin(arr));
    }
}
