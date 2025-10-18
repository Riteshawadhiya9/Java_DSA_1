package Linked_List.Questions;

public class Q12_LC_234_PalindromeLL {
    public static  Node reverseLL(Node head){
        Node curr = head;
        Node prev = null;
        Node Next = null;
        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }

    public static boolean palindromeLL(Node head){
        Node slow = head;               // 1️⃣ slow pointer for middle
        Node fast = head;              // 2️⃣ fast pointer to reach end

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;           // 3️⃣ move slow by 1
            fast = fast.next.next;      // 4️⃣ move fast by 2
        }

        Node temp = reverseLL(slow.next); // 5️⃣ reverse 2nd half
        Node p1 = head;                   // 6️⃣ pointer to 1st half
        Node p2 = temp;                   // 7️⃣ pointer to reversed 2nd half

        while(p2 != null){               // 8️⃣ compare both halves
            if (p1.data != p2.data) {    // 9️⃣ mismatch => not palindrome
                return false;
            } else {
                p1 = p1.next;            // 🔟 move both pointers forward
                p2 = p2.next;
            }
        }
        return true;                     // ✅ all matched => palindrome
    }


    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;

        if(palindromeLL(a)){
            System.out.println("The given Linked List is Palindrome. ");
        }else{
            System.out.println("Not a Palindrome. ");
        }
    }
}
