/*
Sort on array consisting of only 0s ans 1s....?
Input : 0 1 0 1 1 0 1 0
Output : 0 0 0 0 1 1 1 1
 */
package Array_Questions;
import java.util.*;
public class Que_14 {
    public static void printArray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void sort0sand1s(int arr[]){
        int n = arr.length;
        int zeros = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(i < zeros){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
    }

    public static void zeroAnsOnes(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n -1;
        while(left<right){
            if(arr[left] == 1 && arr[right]== 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] =temp;
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i =0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array ");
        printArray(arr);

        // Approach - 1
//        System.out.println("Sorted array");
//        sort0sand1s(arr);
//        printArray(arr);

        // Appeoach - 2
        System.out.println("Sorted array ");
        zeroAnsOnes(arr);
        printArray(arr);


    }
}
