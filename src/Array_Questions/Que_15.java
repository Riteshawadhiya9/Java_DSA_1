/*
Given an array if integer 'a' move all the even integer at the beginning of the array
followed by all the odd integer . The relative order of odd or even integer does not matter . Return
an array that satisfy the condition...?

Input : 3,4,5,6,2,5
Output : 4,6,2,3,5,5
 */
package Array_Questions;
import java.util.*;
public class Que_15 {
    public static void printArray(int [] arr){
        for(int  i= 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // TC = O(n) , Sc = O(n)
    public static void sortByParity(int [] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if(arr[left]%2 != 0 && arr[right]%2 == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left]%2 == 0){
                left++;
            }
            if(arr[right]%2 != 0){
                right--;
            }
        }
    }

    // TC = O(n) , Sc = O(n)
    public static int[] parityMaintainOrder(int arr[]){
        int n = arr.length;
        int temp [] = new int[n];
        int index = 0;

        for(int i = 0 ; i < n ; i++ ){
            if(arr[i] % 2 == 0){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(arr[i]%2 != 0){
                temp[index] = arr[i];
                index++;
            }
        }

        // ye loop tb lge ga agr return type void ho
//        for(int i = 0 ; i < n ; i++){
//            arr[i] = temp[i];
//        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        printArray(arr);

//        System.out.println("Array after parity");
//        sortByParity(arr);
//        printArray(arr);

        int ans [] = parityMaintainOrder(arr);
        System.out.println("Array after parity (Order Maintained)");
        printArray(ans);
    }
}
