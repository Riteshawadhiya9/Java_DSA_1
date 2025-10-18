package Binary_Search_Algorithm.Lecture_45;

import java.util.Scanner;

public class Q_2_sqrt {
    static int sqrt(int x){
        int st = 0 ;
        int end = x ;
        int ans = -1;
        if(x ==0 || x==1) return x;
        while(st <= end){
            int mid = st+(end-st)/2;
            long  val = (long)mid*mid;
            if(val == x ){
                return mid;
            }
            else if(val > x){
                end = mid-1;
            }else{
                st = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
    static int linerSearchMethod(int x){
        int y = 0;
        while(y*y <= x){
            y++;
        }
        return y-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a digit ");
        int x = sc.nextInt();
        System.out.println(sqrt(x));
        System.out.println(linerSearchMethod(x));
    }
}



