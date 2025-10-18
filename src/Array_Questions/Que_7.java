package Array_Questions;//Find smallest and largest elements in the array?
import java.util.*;

public class Que_7 {
    static void printArray(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] smallestAnsLargest(int []arr){
        Arrays.sort(arr);
        int [] ans = {arr[0] , arr[arr.length-1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements :");
        for(int i = 0 ; i < n ;i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = smallestAnsLargest(arr);
        System.out.println("Smallest element in the given array : "+ ans[0]);
        System.out.println("Largest element in the given array : "+ ans[1]);
    }
}
