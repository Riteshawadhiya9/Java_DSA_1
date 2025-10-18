package Binary_Search_Algorithm.Lecture_45;

import java.util.Scanner;

public class Q_1_First_Occurance {
        static int firstOccurance(int [] arr , int x){
            int st = 0;
            int end = arr.length-1;
            int fo = -1;
            while(st <= end){
                int mid = st + (end-st)/2;
                if(x == arr[mid]){
                    fo =mid;
                    end = mid-1; // For First Occurance
                }else if(x < arr[mid]){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }
                return fo;
        }


        static int lastOccurance(int[]arr , int x){
            int st = 0 , end = arr.length-1 , lo = -1;
            while(st <= end){
                int mid = st+ (end-st)/2;
                if(x == arr[mid]){
                    lo = mid;
                    st = mid+1;
                }
                else if(x < arr[mid]){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }
            return lo;
        }
    public static void main(String[] args) {
        Scanner sc  =new Scanner (System.in);
        int []arr = new int[]{2,5,5,5,6,6,8,9,9,9};
        int x = 5;
        System.out.println("First Occurance of "+x+" at index "+ firstOccurance(arr,x));
        System.out.println("Last Occurance of "+x+" at index "+ lastOccurance(arr,x));
    }
}
