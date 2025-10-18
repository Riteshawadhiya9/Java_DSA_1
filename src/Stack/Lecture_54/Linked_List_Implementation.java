package Stack.Lecture_54;

public class Linked_List_Implementation {
    public static class Node{ // user defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{ // user defined data structure
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is Empty!!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek(){
            if(head == null){
                System.out.println("Stack is Empty!!");
                return -1;
            }
            return head.val;
        }

        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }

        void displayRev(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return  size;
        }

        boolean isEmpty(){
            if(size == 0) return  true;
            return  false;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
//        st.displayRev(); // 4
        st.display(); // 4
        st.push(5);
//        st.displayRev(); // 4 5
        st.display(); //4 5
        st.push(6);
//        st.displayRev();
        st.display(); // 4 5 6
        System.out.println("Size is : "+st.size); // 3
        st.pop();
//        st.displayRev();
        st.display(); // 4 5
        System.out.println("Size is : "+st.size); // 2
        st.push(12);
        st.push(17);
        st.display(); // 4 5 12 17
        System.out.println("Size is : "+st.size); // 4
        System.out.println(st.peek()); // 17
    }
}
