package Queue.Lecture_57.Circular_Queue;

public class Array_Implementation {
    public static class cQueue_Array{
        int f =-1;
        int r = -1;
        int size = 0;
        int[] arr = new int[8];
        int n = arr.length;
        public void add(int val) throws Exception{
            if(size == n){
                throw new Exception("Queue is Full!!");
            } else if (size==0) {
                f = r = 0;
                arr[0] = val;
            } else if (r<n-1) {
                arr[++r] = val;
            } else if (r == n-1) {
                r = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty!");
            }
            else{
                int val = arr[f];
                if(f == n-1) f = 0;
                else f++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty!");
            }else{
                return arr[f];
            }
        }

        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty!");
                return;
            } else if (f<=r) {
                for(int i = f ; i <= r ;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else { // r < f
                for(int i = f ; i < n ; i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i = 0 ; i <= r ; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        cQueue_Array q = new cQueue_Array();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.display(); // 1 2 3 4 5 6 7
        q.remove();
        q.display(); //   2 3 4 5 6 7
        q.add(8);
        q.display();//    2 3 4 5 6 7 8
        q.add(9);
        q.display();//    9 2 3 4 5 6 7 8  ->  2 3 4 5 6 7 8 9
//        q.add(10);
        for(int i = 0 ; i < q.arr.length ; i++){
            System.out.print(q.arr[i]+" ");
        }
    }
}
