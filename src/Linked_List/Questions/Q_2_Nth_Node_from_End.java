package Linked_List.Questions;

public class Q_2_Nth_Node_from_End {

    public static Node findNthNodeFromEnd(Node head , int n){ // 2 Paas
        Node temp = head;
        int size = 0;
        while(temp != null){       // 1️⃣ Length nikaal rahe
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;      // 2️⃣ mth node from start = nth from end
        temp = head;
        for(int i = 0 ; i < m-1 ; i++){ // 3️⃣ m-1 tak jaao
            temp = temp.next;
        }
        return temp;               // 4️⃣ temp ab nth node from end pe hai
    }

    public static Node findNthNodeFromEnd2(Node head , int n){ // 1 Paas
        Node slow = head;
        Node fast = head;
        for(int i = 0 ; i < n ; i++){ // 1️⃣ fast ko n steps aage bhejo
            fast = fast.next;
        }
        while (fast != null){        // 2️⃣ fast ko end tak le jao, slow bhi sath chalega
            slow = slow.next;
            fast = fast.next;
        }
        return slow;                // 3️⃣ slow ab nth node from end pe hai
    }

    public static void printList(Node head){
        Node temp = head;               // 1️⃣ Start from head
        while (temp != null){           // 2️⃣ Jab tak null na ho
            System.out.print(temp.data+" "); // 3️⃣ data print karo
            temp = temp.next;           // 4️⃣ next node pe jao
        }
        System.out.println();           // 5️⃣ new line
    }

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;           // 🔹 Node constructor
        }
    }

    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(1);
        Node c = new Node(22);
        Node d = new Node(23);
        Node e = new Node(13);
        Node f = new Node(3);
        Node g = new Node(17);
        Node h = new Node(89);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        Node ans = findNthNodeFromEnd(a,8); // n ki value 1 se start ho rhi h or bottom to up jaa rhi h
        System.out.println(ans.data);

        Node ans2 = findNthNodeFromEnd2(a,1); // same n ka logic (bottom to top)
        System.out.println(ans2.data);
    }
}
