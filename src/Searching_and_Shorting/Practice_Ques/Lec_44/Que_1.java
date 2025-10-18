/*
Given an Array where all its elements are sorted in increasing order except
two swapped elements, sort in linear time . Assume there are no duplicate elements in the array...?
 */

package Searching_and_Shorting.Practice_Ques.Lec_44;

import java.util.Scanner;

public class Que_1 {

    static void display(int[]arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    static void sortArr(int[]arr){
        int n = arr.length;

        if(n<=1){ // Corner case
            return;
        }

        int x = -1;
        int y = -1;
        for(int i = 1 ; i < n ; i++){
            if(arr[i-1] > arr[i]){
                if(x==-1){
                    x = i-1;
                    y=  i;
                }
                else{
                    y = i;
                }
            }
        }

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[]{10,4,5,6,7,8,9,3};
        sortArr(arr);
        display(arr);
     }
}
