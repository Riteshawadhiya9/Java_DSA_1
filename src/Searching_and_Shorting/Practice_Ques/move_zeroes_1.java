package Searching_and_Shorting.Practice_Ques;

import java.util.Scanner;

public class move_zeroes_1 {
    static void move(int []nums){
        int n = nums.length;
        int ans = 0;
        for(int i = 0 ; i < n ;i++){
            if(nums[i]!=0){
                nums[ans] = nums[i];
                ans++;
            }
        }
        for(int i = ans; i < n ;i++){
            nums[i]=0;
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int arr[] = {1,0,0,3,12,3};
        move(arr);
        for(int i =0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
