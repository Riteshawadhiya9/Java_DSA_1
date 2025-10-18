package Linked_List.Questions;

public class Q_4_LC_160_Find_Intersection {

    public static Node getIntersectionNode(Node headA , Node headB){
        Node temp1 = headA;
        Node temp2 = headB;

        int lenA = 0;
        while(temp1 != null){              // 1️⃣ List A ka length nikal lo
            lenA++;
            temp1 = temp1.next;
        }

        int lenB = 0;
        while(temp2 != null){              // 2️⃣ List B ka length nikal lo
            lenB++;
            temp2 = temp2.next;
        }

        temp1 = headA;
        temp2 = headB;

        if(lenA > lenB){                   // 3️⃣ Agar A lambi hai
            int step = lenA - lenB;        // 4️⃣ Kitna extra lamba hai, utne steps aage badho
            for(int i = 0 ; i < step ; i++){
                temp1 = temp1.next;        // 5️⃣ temp1 ko aage badhao
            }
        }else{                             // 6️⃣ Agar B lambi hai
            int step = lenB -  lenA;
            for(int i = 0 ; i < step ; i++){
                temp2 = temp2.next;        // 7️⃣ temp2 ko aage badhao
            }
        }

        while (temp1 != temp2){            // 8️⃣ Jab tak dono same node pe na pahuch jayein
            temp1 = temp1.next;            // 9️⃣ dono ko ek-ek step aage badhate raho
            temp2 = temp2.next;
        }

        return temp2;                      // 🔟 temp1 ya temp2 — dono same node pe honge (intersection)
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){               // 1️⃣ Jab tak null na ho
            System.out.print(temp.data+" "); // 2️⃣ data print karo
            temp = temp.next;             // 3️⃣ next node pe jao
        }
        System.out.println();             // 4️⃣ new line
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;             // 🔹 constructor to assign data
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b= new Node(9);
        Node c = new Node(1);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(4);
        a.next = b;
        b.next = c;
        c.next = e;                        // a ki list: 1 → 9 → 1 → 2 → 4
        d.next = e;                        // d ki list: 3 → 2 → 4
        e.next = f;
        f.next = null;

        Node intersection = getIntersectionNode(a, d); // 🔍 intersection dhoondho
        if (intersection != null) {
            System.out.println("Intersection Node: " + intersection.data);
        } else {
            System.out.println("No Intersection Found.");
        }
    }
}

//public class IntersectionIndex {
//
//    static class Node {
//        int data;
//        Node next;
//        Node(int data) { this.data = data; }  // 🔹 Constructor to assign data
//    }
//
//    // Returns [indexA, indexB] if found, else [-1, -1]
//
//    public static int[] findIntersectionIndex(Node headA, Node headB) {
//        Node ptr1 = headA, ptr2 = headB;
//        int indexA = 0, indexB = 0;
//
//        // First pass to find lengths
//        int lenA = 0, lenB = 0;
//        while (ptr1 != null) {        // 1️⃣ List A ka length nikalo
//            lenA++;
//            ptr1 = ptr1.next;
//        }
//        while (ptr2 != null) {        // 2️⃣ List B ka length nikalo
//            lenB++;
//            ptr2 = ptr2.next;
//        }
//
//        // Reset pointers
//        ptr1 = headA;
//        ptr2 = headB;
//
//        // Skip extra nodes in longer list
//        if (lenA > lenB) {                        // 3️⃣ Agar A lambi hai
//            for (int i = 0; i < lenA - lenB; i++) {
//                ptr1 = ptr1.next;                 // 4️⃣ ptr1 ko aage le jao
//                indexA++;                         // 5️⃣ indexA bhi increase karo
//            }
//        } else {                                  // 6️⃣ Agar B lambi hai
//            for (int i = 0; i < lenB - lenA; i++) {
//                ptr2 = ptr2.next;                 // 7️⃣ ptr2 ko aage le jao
//                indexB++;                         // 8️⃣ indexB bhi increase karo
//            }
//        }
//
//        // Find intersection
//        while (ptr1 != ptr2) {                    // 9️⃣ Jab tak same node na mile
//            ptr1 = ptr1.next;                     // 🔟 dono pointer aage badhao
//            ptr2 = ptr2.next;
//            indexA++;
//            indexB++;
//        }
//
//        return (ptr1 != null) ? new int[]{indexA, indexB} : new int[]{-1, -1}; // 🔚 node mila toh return indexes
//    }
//
//    public static void main(String[] args) {
//        // Example Lists
//        Node a1 = new Node(1);
//        Node a2 = new Node(2);
//        Node a3 = new Node(3);
//        Node c1 = new Node(7);
//        Node c2 = new Node(8);
//
//        // ListA: 1→2→3→7→8
//        a1.next = a2;
//        a2.next = a3;
//        a3.next = c1;
//        c1.next = c2;
//
//        // ListB: 4→5→7→8
//        Node b1 = new Node(4);
//        Node b2 = new Node(5);
//        b1.next = b2;
//        b2.next = c1;     // 💥 yahi se intersection start hoti hai (node 7)
//
//        int[] result = findIntersectionIndex(a1, b1);
//        if (result[0] != -1) {
//            System.out.println("Intersection at: ListA[" + result[0] + "], ListB[" + result[1] + "]");
//        } else {
//            System.out.println("No intersection");
//        }
//    }
//}
