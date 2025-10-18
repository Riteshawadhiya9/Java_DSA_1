package Queue.Lecture_57;

public class Linked_List_Implementation {
    public static class Node{ // user defined data type
        int val;
        Node next;
        Node (int val){
            this.val = val;
        }
    }
    public static class queueLL{ // user defined data Structure
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x){
            Node temp = new Node(x);
            if(size == 0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.val;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        public void display(){
            if(size == 0 ){
                System.out.println("Queue is Empty!!");
                return;
            }
            Node temp = head;
            while (temp != null){
                System.out.print(temp.val+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.display();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q.isEmpty());
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();
        System.out.println(q.size);

    }
}
