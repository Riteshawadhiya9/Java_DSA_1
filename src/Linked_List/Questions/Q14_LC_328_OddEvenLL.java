package Linked_List.Questions;

public class Q14_LC_328_OddEvenLL {
    public static Node oddEvenLL(Node head){
        Node even = new Node(-1);      // 1️⃣ Dummy node for even list
        Node odd = new Node(-1);       // 2️⃣ Dummy node for odd list

        Node tempo = odd;              // 3️⃣ Pointer to build odd list
        Node tempe = even;             // 4️⃣ Pointer to build even list

        Node temp = head;              // 5️⃣ Original list traversal pointer

        while (temp != null){
            tempo.next = temp;         // 6️⃣ Add current node to odd list
            temp = temp.next;          // 7️⃣ Move to next node
            tempo = tempo.next;        // 8️⃣ Move odd pointer forward

            tempe.next = temp;         // 9️⃣ Add next node to even list
            if(temp == null) break;    // 🔟 If list ends, break
            temp = temp.next;          // 1️⃣1️⃣ Move to next of even
            tempe = tempe.next;        // 1️⃣2️⃣ Move even pointer forward
        }

        odd = odd.next;                // 1️⃣3️⃣ Remove dummy node (head of odd list)
        even = even.next;              // 1️⃣4️⃣ Remove dummy node (head of even list)

        tempo.next = even;            // 1️⃣5️⃣ Connect end of odd list to start of even list

        return odd;                   // 1️⃣6️⃣ Return rearranged list (odd + even)
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
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        System.out.println("Original Linked List:");
        display(a);

        // Rearranging the list such that all odd-indexed nodes come before even-indexed nodes
        System.out.println("Linked List after rearranging (odd nodes first, even nodes later):");
        Node ans = oddEvenLL(a);
        display(ans);
    }
}
