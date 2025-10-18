//check if the given array is sorted or not?
package Array_Questions;

import java.util.Scanner;

public class Que_6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = true;
        int arr[] = new int[n];
        for(int i =0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1 ; i < n ; i++){
            if(arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}
