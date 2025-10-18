package Array_Questions;

import java.util.Scanner;

public class printPairs {
    static void printPairs(int arr[]){
        int n = arr.length;
        int tp = 0;
        for(int i = 0 ; i < n ;i++){
            int start = arr[i];
            for(int  j = i+1 ; j< n; j++){
                System.out.print("("+start+","+arr[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pair = "+tp);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter size of Array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" Elements");
        for(int i = 0 ; i < n ; i++){
            arr[i]= sc.nextInt();
        }
        printPairs(arr);
    }
}
