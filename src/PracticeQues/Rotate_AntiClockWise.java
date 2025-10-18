package PracticeQues;

import java.util.Scanner;

public class Rotate_AntiClockWise {
    static void printArray(int [] arr){
        for(int i =0 ;i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int [] rotateAntiClockWise(int arr[] , int k){
        int n = arr.length;
        k = k%n;
        int[] ans = new int[n];
        int j = 0;
        for(int i = k ; i < n ; i++){
            ans[j] = arr[i];
            j++;
        }
        for(int i = 0 ; i < k  ; i++){
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k :");
        int k = sc.nextInt();
        System.out.println("Original array");
        printArray(arr);
        System.out.println("After Rotation ");
        int ans[] = rotateAntiClockWise(arr, k);
        printArray(ans);
    }
}
