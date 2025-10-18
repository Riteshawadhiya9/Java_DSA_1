//Calculate the sum of all the elements in the given array?
//intput :- arr[] = {1,5,3}    Output = 9
package Array_Questions;
import java.util.*;
public class SumOfAllDigit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int arr[] = {1,5,6,7,8};
        int sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
