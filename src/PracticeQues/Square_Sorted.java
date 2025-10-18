package PracticeQues;

import java.util.Scanner;

public class Square_Sorted {
    public static void printArray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] sortSquare(int arr[]){
        int n = arr.length;
        int left = 0 , right = n-1;
        int ans[] = new int[n];
        int k = n-1;
        while(left <= right){
            if(Math.abs(arr[left]) < Math.abs(arr[right])){
                ans[k--] = arr[right] * arr[right];
                right--;
            }
            else{
                ans[k--] = arr[left] * arr[left];
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter Size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = sortSquare(arr);
        printArray(ans);

    }
}
