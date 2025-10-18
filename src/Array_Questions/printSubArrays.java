package Array_Questions;

import java.util.Scanner;

public class printSubArrays {
    static void printSubArrays(int arr[]){
        int n = arr.length;
        int tp =0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j< n ; j++){
                for(int k = i ; k <= j ; k++){
                    System.out.print(arr[k]+" ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays = "+tp);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int arr[] = {2,4,6,8,10};
        printSubArrays(arr);
    }
}
