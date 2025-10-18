package Stack.Lecture_55;

import java.util.Stack;

public class Q5_Next_Greater_Elements {
    public static int[] NGE(int [] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack <Integer> st = new Stack<>();

        res[n-1] = -1;
        st.push(arr[n-1]);

        for(int i = n-2 ; i>= 0 ; i--){
            while (st.size() > 0 && st.peek() < arr[i]){
                st.pop();
            }
            if(st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,2,1,8,6,3,4};
        int[] res = NGE(arr);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        for(int i = 0 ; i < res.length ; i++){
            System.out.print(res[i]+" ");
        }
    }
}
