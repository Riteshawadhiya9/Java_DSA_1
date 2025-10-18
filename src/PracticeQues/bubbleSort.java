package PracticeQues;

import java.util.Scanner;

public class bubbleSort  {
    static void bubble(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ;i++){
            boolean flag = false;
            for(int j = 0 ; j < n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) return;
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner( System.in);
        int arr[] = {1,5,9,2,1,0};
        bubble(arr);
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
}
