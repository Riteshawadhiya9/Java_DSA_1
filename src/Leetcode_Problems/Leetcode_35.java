//Search Insert Postion
// nums= {1,3,5,6}  Target = 5
//Output : 2
package Leetcode_Problems;

import java.util.Scanner;

public class Leetcode_35 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i = 0 ; i < n ;i++){
            if((arr[i] >= target)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(n);
    }
}
