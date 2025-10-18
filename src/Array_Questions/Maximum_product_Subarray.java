package Array_Questions;

public class Maximum_product_Subarray {
    static int maxProductSubArrayBrute(int []arr){ // T.C = O(n^3) & S.C = O(1)
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ;j++){
                int product =1;
                for(int k = i ; k <= j ; k++){
                    product *= arr[k];
                }
                max= Math.max(max,product);
            }
        }
    return max;
    }

    static int sameButOptimal(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            int product = 1;
            for(int j = i; j < n ;j++){
                product *= arr[j];
            }
            max = Math.max(max,product);
        }
    return max;
    }

    public static void main(String[] args) {
        int arr[] = new int[] {2,3,-2,4};
        int ans = maxProductSubArrayBrute(arr);
        int ans1 = sameButOptimal(arr);
        System.out.println("Maximum Product SubArray  is : "+ ans);
        System.out.println("Maximum Product SubArray  is : "+ ans1); // wrong ans
    }
}
