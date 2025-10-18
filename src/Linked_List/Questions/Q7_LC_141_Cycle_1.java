package Linked_List.Questions;

public class Q7_LC_141_Cycle_1 {

    public static boolean cycle_1(Node head){
        if(head == null || head.next == null){       // 1️⃣ Empty list ya sirf 1 node (cycle nahi ban sakti)
            return false;
        }

        Node slow = head;                            // 2️⃣ Slow pointer 1 step move karega
        Node fast = head;                            // 3️⃣ Fast pointer 2 steps move karega

        while(fast != null){                         // 4️⃣ Jab tak fast null na ho (end of list)
            if(slow == null ) return false;          // 5️⃣ Agar slow null ho gaya to cycle nahi
            slow = slow.next;                        // 6️⃣ Slow ek step aage

            if(fast.next == null ) return false;     // 7️⃣ Fast ke aage kuch nahi hai → no cycle
            fast = fast.next.next;                   // 8️⃣ Fast 2 steps aage

            if(fast == slow){                        // 9️⃣ Dono mile → cycle detect
                return true;
            }
        }
        return false;                                // 🔟 Loop end hone ke baad bhi nahi mile → no cycle
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;                        // 📦 Constructor
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(-4);

        a.next = b;                                   // 3 -> 2
        b.next = c;                                   // 2 -> 0
        c.next = d;                                   // 0 -> -4
        d.next = b;                                   // -4 -> 2 (cycle created)

        if(cycle_1(a)){                               // ✅ Check if cycle exists
            System.out.println("True");               // Output if cycle present
        }else{
            System.out.println("False");              // Output if no cycle
        }
    }
}
