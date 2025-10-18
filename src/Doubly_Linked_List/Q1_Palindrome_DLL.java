package Doubly_Linked_List;

public class Q1_Palindrome_DLL {
    public static boolean isPalindrome(Node head){
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node i = head;
        Node j = tail;
        while( i != j){
            if( i.data != j.data){
                return false;
            }
            i = i.next;
            j = j.prev;
        }
        return true;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(1);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = null;

        if(isPalindrome(a)){
            System.out.println("The given Doubly Linked-List is Palindrome ");
        }else{
            System.out.println("Not a Palindrome ");
        }
    }
}
