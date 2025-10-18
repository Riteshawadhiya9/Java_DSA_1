package College_ques;

import java.util.Scanner;

public class Swap_fir_and_last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int  i = 0;
        int j = arr.length-1;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        for(int k = 0 ; k < n ; k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
}