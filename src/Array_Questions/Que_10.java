/*
Find the Second-largest element in the given array.....?
Input : 9,8,9,6,9,8                     |   0,-2,0,-3,0,-4
Output : max = 9,Second max = 8          |    max = 0 , Second max = -2
 */
package Array_Questions;
import java.util.*;
public class Que_10 {

    public static void printArray(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int findMaximum(int []arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        return max;
    }

    public static int findSecondMax(int arr[]){
        int max = findMaximum(arr);
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMaximum(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int ans = findMaximum(arr);
        System.out.println("Maximum elements : "+ans);
        int ans1 = findSecondMax(arr);
        System.out.println("Second Maximum elements : "+ans1);
    }
}
