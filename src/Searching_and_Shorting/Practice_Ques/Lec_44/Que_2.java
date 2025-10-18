/*
Given an array of +ve & -ve integers,segregate them in linear time and constant space.
The output should print all -ve numbers , followed by all +ve numbers..?
Ex - Input- Arr[-1,2,-4,12,0, 9 ,3 ,-4 ];
     Output - Arr[-1,-4,-4,12,0,9,3,2];
 */

package Searching_and_Shorting.Practice_Ques.Lec_44;

public class Que_2 {
    static void display(int []arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    static void partition(int[]arr){
        int l = 0 ;
        int r = arr.length-1;
        while (arr[l] < 0) l++; // agr 0 ko -ve manna hai to < me <= lga do
        while (arr[r] >= 0) r--; // agr 0 ko +ve manna hai to > me >= lga do
        if(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }


    public static void main(String[] args) {
        int [] arr = new int[]{-1,2,-4,12,0, 9 ,3 ,-4};
        partition(arr);
        display(arr);
    }
}
