package Linked_List.Questions;

public class Q3_LC_19_RemoveNthNodefromEnd {

    public static Node removeNthNodeFromEnd(Node head ,int n){
        Node slow = head;
        Node fast = head;

        for(int i = 0 ; i < n ; i++){           // 1️⃣ fast pointer ko n steps aage bhej do
            fast = fast.next;
        }

        if(fast == null){                      // 2️⃣ Agar fast null ho gaya toh head hi delete hoga
            head = head.next;                  // 3️⃣ Head ko next pe le jao (head delete ho gaya)
            return head;                       // 4️⃣ Updated head return karo (main me assign karna zaruri hai)
        }

        while(fast.next != null){              // 5️⃣ Jab tak fast end tak na pahuch jaye
            slow = slow.next;                  // 6️⃣ slow ko ek step aage
            fast = fast.next;                  // 7️⃣ fast ko ek step aage
        }

        slow.next = slow.next.next;            // 8️⃣ slow ke next ko skip kar do (delete node)
        return head;                           // 9️⃣ Final head return karo
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){                   // 1️⃣ Jab tak temp null na ho
            System.out.print(temp.val+" ");    // 2️⃣ Current node ka data print karo
            temp = temp.next;                  // 3️⃣ Next node pe jao
        }
        System.out.println();                  // 4️⃣ New line ke liye
    }

    public static class Node{
        int val;
        Node next ;
        Node(int val){
            this.val = val;                    // 🔹 Node constructor me value assign
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        printList(a);

        a = removeNthNodeFromEnd(a,6);         // 🎯 6th node from end delete karo (yaani head)

        printList(a);
    }
}
