package Linked_List.Questions;

public class Q11_LC_206_ReverseLL {
    public static Node reverseLL(Node head){
        Node curr = head;          // 1️⃣ curr points to current node
        Node prev = null;          // 2️⃣ prev holds previous node (initially null)
        Node Next = null;          // 3️⃣ Next will store next node temporarily

        while(curr != null){       // 4️⃣ Traverse till end of list
            Next = curr.next;      // 5️⃣ Save next node
            curr.next = prev;      // 6️⃣ Reverse current node's pointer
            prev = curr;           // 7️⃣ Move prev to current
            curr = Next;           // 8️⃣ Move curr to next (forward)
        }
        return prev;               // 9️⃣ prev is new head now
    }


    public static Node reverseLLRec(Node head){
        if(head == null || head.next == null){   // 1️⃣ Base case: empty or single node
            return head;
        }

        Node newHead = reverseLLRec(head.next);  // 2️⃣ Recursive call till last node

        head.next.next = head;                   // 3️⃣ Reverse the link
        head.next = null;                        // 4️⃣ Break old connection

        return newHead;                          // 5️⃣ Return new head from recursion
    }


    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null\n");
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        display(a);

//        Node revRec = reverseLLRec(a);
//        display(revRec);

        Node revLL = reverseLL(a);
        display(revLL);

    }
}
