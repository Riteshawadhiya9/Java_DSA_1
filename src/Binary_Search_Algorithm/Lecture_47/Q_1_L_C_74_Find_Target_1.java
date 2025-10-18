package Binary_Search_Algorithm.Lecture_47;

public class Q_1_L_C_74_Find_Target_1 {
    static boolean search2D(int [][]arr , int target){
        int n = arr.length;
        int m = arr[0].length;
        int st = 0;
        int end = n*m-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            int midElement = arr[mid/m][mid%m];
            if(target == midElement){
                return true;
            }
            if(target < midElement){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][] arr = {{1,3,5,7},{10,11,16,10},{23,30,34,60}};
        int target = 18;
        System.out.println(search2D(arr,target));
    }
}
