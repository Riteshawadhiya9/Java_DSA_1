package Linked_List.Questions;

public class Q8_LC_142_Cycle2 {

    public static Node cycle2(Node head){
        if(head == null || head.next == null){           // 1️⃣ Agar list empty hai ya ek hi node hai
            return null;                                 //    → Cycle ban hi nahi sakti
        }

        Node slow = head;                                // 2️⃣ Slow → 1 step
        Node fast = head;                                // 3️⃣ Fast → 2 steps

        while(fast != null && fast.next != null){        // 4️⃣ Jab tak fast null na ho
            slow = slow.next;                            // 5️⃣ Slow aage 1 step
            fast = fast.next.next;                       // 6️⃣ Fast aage 2 steps

            if(fast == slow){                            // 7️⃣ Cycle detect ho gaya
                break;
            }
        }

        if(fast == null || fast.next == null){           // 8️⃣ Agar fast end pe pahucha → No cycle
            return null;
        }

        Node temp = head;                                // 9️⃣ New pointer start se
        while(temp != slow){                             // 🔁 Jab tak temp aur slow milte nahi
            temp = temp.next;                            // 1 step
            slow = slow.next;                            // 1 step
        }

        return slow;                                     // 🔟 Cycle ka starting point
    }

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(-4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;                                       // 👈 Cycle created: -4 → 2

        Node cycleStart = cycle2(a);

        if (cycleStart != null) {
            System.out.println("Cycle detected at node with value: " + cycleStart.data);
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }
}
