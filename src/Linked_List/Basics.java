package Linked_List;

public class Basics {
    public static void insertAtEnd(Node head , int val){  // T.C --> O(n)
        Node temp = new Node(val);
        Node t = head;
        while(t.next != null){
            t = t.next;
        }
        t.next = temp;
    }
    public static void printLLRec(Node head){
        if(head == null)return;
        System.out.print(head.data+" ");
        printLLRec(head.next);
    }

    public static void printLLRevRec(Node head){
        if(head == null)return;
        printLLRevRec(head.next);
        System.out.print(head.data+" ");
    }

    public static int findLenght(Node head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return  count;
    }

    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        return;
    }
    public static  class Node{
        int data; // value
        Node next; // address of next node

        // constructor
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5); // head node
        Node b = new Node(42);
        Node c = new Node(0);
        Node d = new Node(3);
        Node e = new Node(15); // tail node
        a.next = b; // 5 -> 42  0 3 15
//        System.out.println(a.next.date); // 42
        b.next = c;// 5 -> 42 -> 0 3 15
        c.next = d; // 5 -> 42 -> 0 -> 3 15
        d.next = e;// 5 -> 42 -> 0 -> 3 -> 15

        System.out.println(a.data); // 5
        System.out.println(a.next.data);//42
        System.out.println(a.next.next.data); //0
        System.out.println(a.next.next.next.data);//3
        System.out.println(a.next.next.next.next.data);//15
        System.out.println(a.next.next.next.next.next);// null

        Node temp = a;
        for(int i = 0 ; i < 5 ; i++){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();

        Node temp2 = a;
        while(temp2 != null){
            System.out.print(temp2.data+" ");
            temp2 = temp2.next;
        }

        System.out.println();

        printLL(a);

        System.out.println();

        printLLRec(a);

        System.out.println();

        printLLRevRec(a);

        System.out.println();

        System.out.println("Length of given Linked List : "+findLenght(a));

        System.out.println();

        insertAtEnd(a , 20);
        printLL(a);
        System.out.println();
        System.out.println("Length of given Linked List : "+findLenght(a));

    }
}
