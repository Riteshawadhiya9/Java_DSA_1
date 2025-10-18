//Calculate the maximum value out of all the element in the array
// intput = arr[] = {2,4,5,6,7,9}     Output = 9
package Array_Questions;

import java.util.Scanner;


public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = {1,3,4,6,8,44,22,33};
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
