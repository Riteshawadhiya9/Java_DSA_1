package Binary_Search_Algorithm.Lecture_46;

public class Q_3_Find_Target_Duplicates {
    static int findTargetInDuplicate(int[]arr,int target){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st <= end){
            int mid = st+(end-st)/2;
            if(target == arr[mid]) {
                return mid;
            }
            /*
            purana code pura copy hai bs ye wala else if add ho gya hai or
             */
            else if(arr[st] == arr[mid] && arr[mid] == arr[end]){
                st++;
                end--;
            }
            else if(arr[mid] <= arr[end]){ // yaha par < se <= ho gya hai
                if(target > arr[mid] && target <= arr[end]){
                    st= mid+1;
                }else{
                    end = mid-1;
                }
            }else{
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
        int []arr = new int[]{1,1,1,2,2,2,3,4,5,5,1,1,1};
        int target = 3;
        int ans = findTargetInDuplicate(arr,target);
        if(ans!=-1){
            System.out.println("Target is found at index : " + ans );
        }else{
            System.out.println("Target is not Found : " + ans);
        }
    }
}
