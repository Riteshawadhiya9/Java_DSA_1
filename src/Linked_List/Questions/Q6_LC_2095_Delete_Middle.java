package Linked_List.Questions;

// Only for even case find left and right middle...?
public class Q6_LC_2095_Delete_Middle {

    public static Node deleteRightMiddle(Node head){

        if (head == null || head.next == null) {       // 1️⃣ Agar list me 1 ya 0 node hai
            return null;                               // 2️⃣ Middle delete ka matlab hi nahi
        }

        Node slow = head;
        Node fast = head;

        while(fast.next.next != null){                 // 3️⃣ Jab tak fast ka next-next null na ho
            slow = slow.next;                          // 4️⃣ slow ek step
            fast = fast.next.next;                     // 5️⃣ fast 2 step
        }

        Node deletedNode = slow.next;                  // 6️⃣ slow.next = right middle
        slow.next = slow.next.next;                    // 7️⃣ delete right middle
        return deletedNode;                            // 8️⃣ deleted node return
    }

    public static Node deleteleftMiddle(Node head){

        if (head == null || head.next == null) {       // 1️⃣ Empty ya single node list
            return null;
        }

        Node slow = head;
        Node fast = head;


        while( fast.next.next.next != null && fast.next.next.next.next != null){
            slow = slow.next;                          // 2️⃣ slow ek step
            fast = fast.next.next;                     // 3️⃣ fast 2 step
        }

        Node deletedNode = slow.next;                  // 4️⃣ slow.next = left middle
        slow.next = slow.next.next;                    // 5️⃣ delete left middle
        return deletedNode;                            // 6️⃣ deleted node return
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");      // 1️⃣ Node data print
            temp = temp.next;                          // 2️⃣ Next node pe jao
        }
        System.out.println("null\n");                    // 3️⃣ End of list

    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;                          // 🔹 Constructor
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        System.out.println("Original List :");
        printList(a);

        Node deletedLeft = deleteleftMiddle(a);                     // 🔥 Left-middle delete
        System.out.println("Left Deleted Node : "+ deletedLeft.data + "\n" ); // ➡️ Output: 3

        System.out.println("List After Deletion :");
        printList(a);

        // If you want to test right-middle deletion instead:

//        System.out.println("Original List :");
//        printList(a);
//
//        Node deletedRight = deleteRightMiddle(a);                    // 🔥 Right-middle delete
//        System.out.println("Right Deleted Node : "+ deletedRight.data + "\n" ); // ➡️ Output: 4
//
//        System.out.println("List After Deletion :");
//        printList(a);
    }
}
