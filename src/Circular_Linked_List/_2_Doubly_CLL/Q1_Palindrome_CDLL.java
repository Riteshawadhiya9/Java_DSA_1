package Circular_Linked_List._2_Doubly_CLL;

public class Q1_Palindrome_CDLL {

    // Node class
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }


    public static boolean isPalindrome(Node head) {
        //  Empty list         Single Node   
        if (head == null || head.next == head) return true;

        Node left = head;
        Node right = head.prev;

        while (left != right) {
            if (left.val != right.val) return false;
            left = left.next;
            right = right.prev;

            // Additional check for even-length lists
            if (left == right.next) break;
        }
        return true;
    }


    public static void display(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }

        System.out.print(temp.val + "->");
        System.out.println("(back to head)\n");
    }


    public static void main(String[] args) {
        // Create nodes
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(1);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = a; // Circular


        b.prev = a;
        c.prev = b;
        d.prev = c;
        e.prev = d;
        f.prev = e;
        a.prev = f; // Circular


        display(a);


        if (isPalindrome(a)) {
            System.out.println("It is a Palindrome ❤️");
        } else {
            System.out.println("Not a Palindrome 💔");
        }
    }
}
