// Find last Occurances of an element x in a given array
// Input: arr[]= {1,1,3,1,5}  x= 1
// Output: 3
package Array_Questions;

public class last_Occurance {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,3,4,5,2,1};
        int x = 1;
        int count = -1;
        for(int i =0 ; i < arr.length ;i++){
            if(arr[i] == x){
                count = i;
            }
        }
        System.out.println(count);
    }
}
