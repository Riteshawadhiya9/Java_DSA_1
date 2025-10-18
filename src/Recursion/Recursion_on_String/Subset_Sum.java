package Recursion.Recursion_on_String;

import java.util.Scanner;

public class Subset_Sum {
    static void subsetSum(int []a,int idx , int currSum){
        // base case
        if(idx >= a.length){
            System.out.println(currSum);
            return;
        }
        // curr idx + sum
        subsetSum(a,idx+1,currSum+a[idx]);
        // curr idx
        subsetSum(a,idx+1,currSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = {2,4,5};
        subsetSum(arr,0,0);
    }
}
