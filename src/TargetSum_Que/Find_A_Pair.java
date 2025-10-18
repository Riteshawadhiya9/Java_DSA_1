//Input: nums = [2, 7, 11, 15], target = 9
//Output: [2, 7]
package TargetSum_Que;
import java.util.*;
public class Find_A_Pair {
    static int [] findPair(int arr[] , int target){
        for(int i = 0  ; i < arr.length ; i++){
            for(int j = i+1;j < arr.length ; j++){
//                for(int k = i +2 ; k < arr.length ; k++){
                    if(arr[i]+arr[j] /* + arr[k]*/  == target){
                        return new int[]  {arr[i] , arr[j] /*, arr[k]*/};// if you return indices then {i,j}
//                    }
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target : ");
        int target = sc.nextInt();
        int ans[] = findPair(arr , target);
        if(ans != null){
            System.out.println("Pair Found : ["+ans[0] +","+ ans[1]+/*","+ans[2]+*/"]");
        }else{
            System.out.println("Pair Not Found ");
        }
    }
}
