package Linked_List.Questions;

// For  only even Case find left and right middle both...?
public class Q5_LC_876_Find_Middle {

    public static Node findLeftMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next.next != null){     // 1️⃣ Jab tak fast ke next ka bhi next ho (even case ke liye)
            slow = slow.next;              // 2️⃣ slow ek step
            fast = fast.next.next;         // 3️⃣ fast 2 steps
        }

        return slow;                       // 4️⃣ slow ab left-middle pe hai
    }

    public static Node findRightMiddle(Node head){
        Node slow = head;
        Node fast = head;

        // fast.next != null ye condition lgane se odd , even dono case chl jainge or agr sirf even case pe chalana hai to fast != null wali condition shi hai

        while(fast != null  && fast.next != null){   // 1️⃣ Jab tak fast aur fast.next null na ho
            slow = slow.next;                        // 2️⃣ slow ek step
            fast = fast.next.next;                   // 3️⃣ fast 2 steps
        }

        return slow;                                 // 4️⃣ slow ab right-middle pe hai
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;                        // 🔹 constructor to assign value
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
        f.next = null;                                // 🔚 end of list

        Node left = findLeftMiddle(a);                // 🎯 Left middle find
        Node right = findRightMiddle(a);              // 🎯 Right middle find

        System.out.println("Left Middle: " + left.data);   // Output: 4
        System.out.println("Right Middle: " + right.data); // Output: 5
    }
}
