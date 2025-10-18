package Stack.Lecture_55;

import java.util.*;

public class Q8_Largest_Reactangle_Histogram {
    public static int largestHistogram(int[] height){
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];
        // calculating next smallest element 
        st.push(n-1);
        nse[n-1] = n;
        for(int i = n-2 ; i >= 0 ; i--){
            while (st.size()>0 && height[st.peek()] >= height[i]){
                st.pop();
            }
            if(st.size() == 0) nse[i] = n;
            else  nse[i] = st.peek();
            st.push(i);
        }
        // emptying Stack
        st.clear();
        // calculate previous smallest elements[]
        st.push(0);
        pse[0] = -1;
        for(int i = 1 ; i < n ; i++){
            while(st.size()>0 && height[st.peek()] >= height[i]){
                st.pop();
            }
            if(st.size() == 0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
        // maximum area of reactangle
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i ++){
            int area = height[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max,area);
        }
        return  max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,1,5,6,2,3};
        System.out.println(largestHistogram(arr));
    }
}
