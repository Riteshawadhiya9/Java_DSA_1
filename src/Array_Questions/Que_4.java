// Count the number of occurances of a particular element x ;
// intput = arr[] = {5,6,5,1,5}
//output = 3
package Array_Questions;

import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner (System.in);
        int arr[] = {5,5,5,6,7,3,5,};
        int x = 5;
        int ans = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
