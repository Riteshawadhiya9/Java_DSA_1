package Circular_Linked_List._1_Singly_CLL;

public class Q1_Print_SCLL {
    public static void print(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        // Print the last node
        System.out.print(temp.data + "->");
        System.out.println("(back to head)\n");
    }


    public static Node deleteHead(Node head){
        if (head == null) return null;

        // Case: Only one node
        if (head.next == head) {
            return null;
        }
        Node temp = head.next;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = head.next;//  temp.next = temp.next.next;
        return head.next;
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node (1);
        Node b = new Node (2);
        Node c = new Node (3);
        Node d = new Node (4);
        Node e = new Node (5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;// making it circular


        print(a);

        Node deleteHead = deleteHead(a);
        print(deleteHead);

    }
}
