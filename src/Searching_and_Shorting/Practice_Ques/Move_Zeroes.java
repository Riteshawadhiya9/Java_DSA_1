package Searching_and_Shorting.Practice_Ques;

import java.util.Scanner;

public class Move_Zeroes {
    static void solution(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            boolean flag = false;
            for(int j = 0 ; j < n - i -1 ; j++){
                if(arr[j] == 0 && arr[j+1]  != 0){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag) return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arr = {0,1,0,3,12};
        solution(arr);
        for(int ans : arr){
            System.out.print(ans+" ");
        }
     }
}
