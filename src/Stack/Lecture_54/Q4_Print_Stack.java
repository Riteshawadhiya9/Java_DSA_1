package Stack.Lecture_54;

import java.util.Stack;

public class Q4_Print_Stack {
        public static void printStackRevRec(Stack<Integer> temp){
            if(temp.size() == 0) return;
            int top = temp.pop();
            System.out.print(top+" ");
            printStackRevRec(temp);
            temp.push(top);
            return;
        }

    public static void printStackRec(Stack<Integer> temp){
        if(temp.size() == 0) return;
        int top = temp.pop();
        printStackRec(temp);
        System.out.print(top+" ");
        temp.push(top);
        return;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        System.out.println("Print using Method -> "+st);
        printStackRevRec(st);
        System.out.println();
        printStackRec(st);


        //Method->1 to print Stack with  using extra Stack
//        Stack<Integer> temp = new Stack<>();
//        while(st.size()>0){
//            temp.push(st.pop());
//        }
//        while (temp.size()>0){
//            int x = temp.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }


        //Method->2 to print Stack with using Array
//        int n = st.size();
//        int []arr = new int[n];
//        for(int i = n-1 ; i >= 0 ; i--){
//            arr[i] = st.pop();
//        }
//        for(int i = 0 ; i < n ; i++){
//            System.out.print(arr[i]+" ");
//            st.push(arr[i]);
//        }
    }
}
