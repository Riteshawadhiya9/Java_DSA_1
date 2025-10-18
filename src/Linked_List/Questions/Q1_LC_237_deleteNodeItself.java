package Linked_List.Questions;

public class Q1_LC_237_deleteNodeItself {

    public static void deleteNodeItself(Node node){
        // 🔥 Node ko directly delete nahi kar sakte, kyunki previous node ka reference nahi hai
        // 🧠 Trick: Current node ke data ko uske next wale node ke data se overwrite kar do
        node.data = node.next.data;

        // 📌 Ab current node ke next ko, next-next node pe point karwa do (skip the next node)
        node.next = node.next.next;
    }

    public static void printList(Node head){
        Node temp = head;                     // 1️⃣ Temporary pointer banaya head se start karne ke liye
        while (temp != null){                 // 2️⃣ Jab tak list khatam na ho jaye
            System.out.print(temp.data+" ");  // 3️⃣ Current node ka data print karo
            temp = temp.next;                 // 4️⃣ Agle node pe move karo
        }
        System.out.println();                 // 5️⃣ Ek new line for better formatting
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;                 // 💡 Constructor se data assign kiya
        }
    }

    public static void main(String[] args) {
        // 🔧 Nodes create kiye with values
        Node a = new Node(-1);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(10);
        Node e = new Node(35);
        Node f = new Node(53);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        System.out.println("Before deletion:");
        printList(a);

        deleteNodeItself(d);  // 🎯 Node `d` ko delete karna hai (value 10)

        System.out.println("After deletion:");
        printList(a);
    }
}
