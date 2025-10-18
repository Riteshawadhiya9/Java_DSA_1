package Searching_and_Shorting;
import java.util.*;
public class Count_Sort {
    static int findMax(int[]arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static void basicCountSort(int []arr){
        int max = findMax(arr);
        int count[] = new int[max+1];
        for(int i =0 ; i < arr.length ; i++){
            count[arr[i]]++;
        }
        int k = 0;
        for(int i = 0 ; i < count.length ; i++){
            for(int j = 0 ;j < count[i] ; j++){
                arr[k++] = i;
            }
        }
    }

    static void display(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int[] arr = {1,2,3,2,2,1,0,1,9};
//        basicCountSort(arr);
//        display(arr);

        
    }
}
