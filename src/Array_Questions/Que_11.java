/*
Given an array 'a' consisting of integer .Return the first value that is repeating in this array .
If no value is being repeated . Return -1....?
Input: 1,5,6,3,4,3,6
Output = 3
 */
package Array_Questions;
import java.util.*;
public class Que_11 {

    public static int findrepeatingNumber(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            for(int j = i + 1; j<n ; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("First Repeating Number is : "+findrepeatingNumber(arr));
    }
}
