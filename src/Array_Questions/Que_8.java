// Find the total numbers of pairs in the array whose sum is equal to the given value x ?
// Intput: 4,6,3,5,8,2      x = 7 -->  {4,3}, {5,2}
// Output:  (2) -->   {4,3},{5,2}
package Array_Questions;
import java.util.*;
public class Que_8 {

    static void printArray(int[]arr){
        int n = arr.length;
        for(int  i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int pairSum(int[]arr,int target){
        int n = arr.length;
        int count = 0;
        System.out.print("Pairs are :");
        for(int i = 0 ; i < n ; i++){
            for( int j = i + 1 ; j < n ; j++){
                if(arr[i] + arr[j] == target){
                    count++;
                    System.out.println("{"+arr[i]+","+arr[j]+"}");
                }
            }
        }
        return count;
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
        System.out.println("Enter target :");
        int x = sc.nextInt();

        int ans = pairSum(arr,x);
        System.out.println("Total no.of Pair is : "+ans);
    }
}
