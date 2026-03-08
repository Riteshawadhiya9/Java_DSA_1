package Array_Questions.Sliding_window;

public class Q2_Sum_Of_Min_n_Max {
    public static int findMinMax(int[]arr,int k){
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n ; i++){
            int length = 0;
            for(int j = i ; j < n ; j++){
                length++;

                if(length == k){
                    int max = Integer.MIN_VALUE;
                    int min = Integer.MAX_VALUE;

                    for(int m = i ; m <= j ; m++){
                        min = Math.min(min,arr[m]);
                        max = Math.max(max,arr[m]);
                    }
                sum += min + max;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,-1,7,-3,-1,-2};
        int k = 4;
        int ans = findMinMax(arr,k);
        System.out.println(ans);

    }
}
