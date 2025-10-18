// Reverse an array
// Input : 2,3,4,5,6
//Output : 6,5,4,3,2
package Array_Questions;
import java.util.*;
public class Que_12 {

    static void printArray(int[]arr){
        int n = arr.length;
        for(int  i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverse(int [] arr){
        int n = arr.length;
        int st = 0;
        int ed = n-1;
        while(st < ed){
            int temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st++;
            ed--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        printArray(arr);
    }
}
