package Dynamic_Programming;
import  java.util.*;
// LC -> 198
public class Ques_2_House_Robber {

    static int[]dp;

    public static void main(String[] args) {

        int [] arr = new int[]{2,7,9,3,1};
        int ans = robber(arr);
        System.out.println("MAX : "+ans);
    }

    private static int robber(int [] nums){

        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp,Integer.MIN_VALUE);

        return helper(0,nums);
    }
    private static int helper(int i , int[] arr){

        if(i >= arr.length) return 0;

        if(dp[i] != Integer.MIN_VALUE) return dp[i];

        int pick = arr[i] + helper(i+2 , arr);
        int skip = helper(i+1 , arr);

        int ans = Math.max(pick,skip);
        dp[i] = ans;
        return ans;
    }
}
