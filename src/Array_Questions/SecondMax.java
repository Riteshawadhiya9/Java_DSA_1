package Array_Questions;

import java.util.Scanner;
public class SecondMax {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        if(n<2){
            System.out.println("Array Should have at least two elements");
            return;
        }
        int arr[] = new int [n];
        System.out.println("Enter "+n+" elements");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }else if(arr[i]>second && arr[i]!=first){
                second = arr[i];
            }
        }

        System.out.println("Second Maximum is : " + second);
    }
}
