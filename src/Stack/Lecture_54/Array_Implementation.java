package Stack.Lecture_54;

public class Array_Implementation {
    public static class Stack{
        int []arr = new int[5];
        int idx = 0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full ");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek(){
            if(idx == 0){
                System.out.println("Stack is Empty!");
                return  -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx == 0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        void display(){
            for(int i = 0 ; i <= idx-1 ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx == 0) return true;
            return false;
        }

        boolean isFull(){
            if(idx == arr.length) return true;
            return false;
        }

        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.display(); // 1
        st.push(2);
        st.display(); // 1 2
        st.push(3);
        st.display(); // 1 2 3
        st.push(4);
        st.display(); // 1 2 3 4
        System.out.println("Size is : "+st.size()); // 4
        st.pop();
        System.out.println("Size is : "+st.size()); // 3
        st.push(8);
        st.display(); // 1 2 3 8
        st.push(3);
        st.display(); // 1 2 3 8 3
        System.out.println(st.isFull()); // true
        System.out.println(st.capacity()); // 5
        st.push(19); // Stack is Full


    }
}
