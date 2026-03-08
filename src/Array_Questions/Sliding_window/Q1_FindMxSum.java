package Array_Questions.Sliding_window;

import java.util.Scanner;

public class Q1_FindMxSum {
    public static void print(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int findMaxSumOf3subArr(int[]arr){
        // brute force but the array should be >than 3 and only give in positive array
        int n = arr.length;
        int max = 0;
        for(int i = 0 ; i < n-2 ; i++){
            int sum = 0;
            for(int j = i ; j < i+3 ; j++){
                sum += arr[j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter size : ");
        int [] arr = new int[]{1,2,3,4,5,6};
        int ans = findMaxSumOf3subArr(arr);
        System.out.println(ans);
    }
}
