package Binary_Search_Algorithm.Lecture_47;

public class Q_3_L_C_852_Peak_index {
    static int findPeakIdx(int[]arr){
        int st = 0;
        int end = arr.length-1;
        int ans = Integer.MIN_VALUE;
        while(st <= end){
            int mid = st+(end-st)/2;
            if(arr[mid] < arr[mid+1]){ //  we will go upper side of the mountain
                st = mid+1;
                ans = mid+1;
            }else { // (arr[mid] > arr[mid+1]) we will go down side of the mountain
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,10,7,3,1,0};
        System.out.println("Peak Index of the given array is : "+findPeakIdx(arr));
    }
}
