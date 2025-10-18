// Search the given element x in the array . If present then return the index else return -1;
// Input arr[] = {1,5,6} x = 5
// Output  = 1
package Array_Questions;

import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = {1,5,6,3,4,6,7,8,4,};
        int ans = -1;
        int x = sc.nextInt();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
