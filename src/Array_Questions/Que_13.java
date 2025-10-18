/*
Rotate the given array 'a' by k steps , where k is non-negative
NOTE:- K acn be greater than n as well
 */
package Array_Questions;
import java.util.*;
public class Que_13 {

    public static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int arr[],int i,int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static int [] rotate(int arr[] , int k){
        int n = arr.length;
        k = k%n;
        int ans[] = new int [n];
        int j = 0;
        for(int i = n-k ; i < n ;i++){
            ans[j++] = arr[i];
        }
        for(int i = 0 ; i < n-k ; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void rotateInPlace(int arr[] , int k){
        int n = arr.length;
        k = k%n;
        reverseArray(arr , 0 , n-k-1);
        reverseArray(arr,  n-k , n-1);
        reverseArray(arr , 0 ,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Array size : ");
        int n = sc.nextInt();
        System.out.print("Enter k : ");
        int k = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array :");
        printArray(arr);
        System.out.println("Array after rotation :");
//        int [] ans = rotate(arr,k);
//        printArray(ans);

        rotateInPlace(arr,k);
        printArray(arr);

    }
}
