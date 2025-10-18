package Linked_List;

public class Implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;
        int size = 0;                         // T.C. -->O(1)

        void insertAtEnd(int val) {  // T.C. --> O(1)
            Node temp = new Node(val);       // 1️⃣ New node banaya with given value
            if (head == null) {              // 2️⃣ Agar list empty hai
                head = temp;                 // 3️⃣ Head ko new(temp) node se point kara do
            } else {                         // 4️⃣ List me pehle se nodes hai
                tail.next = temp;            // 5️⃣ Tail ka next ab new node ho gaya
            }
            tail = temp;                     // 6️⃣ Tail ko update karo new node pe
            size++;                          // Size increment
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {              // empty list
                head = tail = temp;
//              insertAtEnd(val);            // head = tail = temp; ki  jageh funCall  bhi kr  skte h bcoz empty list me tum aage add kro ya piche add kro same hi hai
            } else {                         // non-empty list
                temp.next = head;
                head = temp;
            }
            size++;
        }

//        void insertAtHead(int val){
//            Node temp = new Node(val);        // 1️⃣ New node banaya with given value
//            if(head == null){                 // 2️⃣ Agar list empty hai
//                head = tail = temp;           // 3️⃣ Head aur tail dono ko new node point karega
//            }else{                            // 4️⃣ List me pehle se nodes hai
//                temp.next = head;             // 5️⃣ New node ka next ab current head hai
//                head = temp;                  // 6️⃣ Head ko update karo new node pe
//            }
//        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);                // 1️⃣ New node banaya
            if (idx == length()) {                 // 2️⃣ Agar index list ke end ke equal hai
                insertAtEnd(val);                  // 3️⃣ Toh insertAtEnd waala logic chala do
                return;                            // 4️⃣ Function yahin pe return kar jaayega
            } else if (idx == 0) {                 // 5️⃣ Agar index 0 hai (insert at beginning)
                insertAtHead(val);                 // 6️⃣ Toh insertAtHead waala logic chala do
                return;                            // 7️⃣ Function return kar jaayega
            } else if (idx < 0 || idx > length()) {// 8️⃣ Agar index invalid hai (negative ya out of range)
                System.out.println("Wrong index"); // 9️⃣ Error message print karo
                return;                            // 🔟 Function ko return karwa do
            }
            Node temp = head;                      // 1️⃣1️⃣ Start from head
            for (int i = 0; i < idx - 1; i++) {    // 1️⃣2️⃣ idx-1 tak jao
                temp = temp.next;
            }
            t.next = temp.next;                    // 1️⃣3️⃣ New node ka next = next of temp
            temp.next = t;                         // 1️⃣4️⃣ temp ka next = new node (inserted)
            size++;                                // Size increment
        }

        int getAt(int idx) {
            Node temp = head;                          // 1️⃣ Start temp from head
            if (idx < 0 || idx >= length()) {          // 2️⃣ Agar index invalid hai (negative ya out of range)
                System.out.println("Wrong index");     // 3️⃣ Error message print karo
                return -1;                             // 4️⃣ Return a dummy value (since return; will give error)
            }
            for (int i = 0; i < idx; i++) {            // 5️⃣ idx baar next-next karke temp ko le jao
                temp = temp.next;
            }
            return temp.data;                          // 6️⃣ temp ab idx wale node pe hai, uska data return karo
        }

        void deleteAt(int idx) {                       // 1️⃣ Function to delete node at given index
            if (idx < 0 || idx >= size) {              // 2️⃣ Agar index invalid hai (negative ya size se bada)
                System.out.println("Invalid index");   // 3️⃣ Error message print karo
                return;                                // 4️⃣ Function ko terminate karo
            }

            if (idx == 0) {            // 5️⃣ Agar index 0 hai (head delete karna hai)
                head = head.next;      // 6️⃣ Head ko next node pe shift karo
                size--;                // 7️⃣ Size kam karo
                return;                // 8️⃣ Function return
            }

            Node temp = head;                      // 9️⃣ Ek temporary pointer banaya jo head se start karega
            for (int i = 0; i < idx - 1; i++) {   // 🔟 temp ko idx-1 wale node tak le jao
                temp = temp.next;                // 1️⃣1️⃣ Move temp to next
            }

            temp.next = temp.next.next;     // 1️⃣2️⃣ temp.next ko skip karwa ke next-next node pe point kara do

            if (idx == size - 1) {     // 1️⃣3️⃣ Agar last node delete ho rahi hai
                tail = temp;         // 1️⃣4️⃣ Toh tail ko update kar do
            }

            size--;               // 1️⃣5️⃣ Size ko decrease karo
        }

        void display() {
            Node temp = head;                      // 1️⃣ Temporary pointer head pe rakha
            while (temp != null) {                 // 2️⃣ Jab tak temp null na ho
                System.out.print(temp.data + " "); // 3️⃣ Node ka data print karo
                temp = temp.next;                  // 4️⃣ Next node pe jao
            }
            System.out.println();                  // 5️⃣ Line change for clean output
        }

        int length() {                            // T.C. --> O(n)
//            Node temp = head;                   // 1️⃣ Temporary pointer ko head pe rakha
//            int cnt = 0;                        // 2️⃣ Count variable banaya
//            while (temp != null) {              // 3️⃣ Jab tak list khatam na ho
//                cnt++;                          // 4️⃣ Ek node count ki
//                temp = temp.next;               // 5️⃣ Next node pe move kiya
//            }
//            return cnt;                         // 6️⃣ Final count return kiya
//        }
            return size;
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(4); // 4
        ll.insertAtEnd(5); // 4 -> 5
        ll.insertAtEnd(0); // 4 -> 5 -> 0
        ll.display(); // 4 -> 5 -> 0
        System.out.println("Length of the given Linked List is : " + ll.length()); // 3

        ll.insertAtHead(3); // 3 -> 4 -> 5 -> 0
        ll.insertAtHead(2); // 2 -> 3 -> 4 -> 5 -> 0
        ll.insertAtHead(1); // 1 -> 2 -> 3 -> 4 -> 5 -> 0
        ll.display(); // 1 -> 2 -> 3 -> 4 -> 5 -> 0
        System.out.println("Length of the given Linked List is : " + ll.length()); // 6

        ll.insertAt(3, 30); // 1 -> 2 -> 3 -> 30 -> 4 -> 5 -> 0
        ll.display();
        System.out.println("Length of the given Linked List is : " + ll.length()); // 7

        System.out.println("Value : " + ll.getAt(3)); // 30

        ll.deleteAt(3);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println("Length of the given Linked List is : " + ll.length()); // 6
    }
}
