package Binary_Search_Algorithm.Lecture_46;

public class Q_2_Find_Target {
    static int findTarget(int[]arr,int target){
        int n = arr.length;
        int st  = 0;
        int end = n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(arr[mid] < arr[end]){ // mid to end  is sorted basically 2nd part
                if(target > arr[mid] && target <= arr[end]){
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }else{ // st to mid  is sorted basically 1st part
                if(target >= arr[st] && target < arr[mid]){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{8,9,10,11,12,1,2,3,4,5,6,7};
        int target = 10;
        int ans = findTarget(arr,target);
        if(ans != -1){
            System.out.println("Target is present at index : "+ans);
        }else{
            System.out.println("Target is not present in the given array ");
        }
    }
}
