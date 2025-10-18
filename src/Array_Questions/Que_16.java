package Array_Questions;
import java.util.*;
public class Que_16 {
    public static void printArray(int []arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);

    }
}
