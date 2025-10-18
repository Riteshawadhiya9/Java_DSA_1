package Linked_List.Questions;

public class Q10_LC_82_Remove_Duplicate {
    public static Node remmoveDup(Node head){
        Node temp = head;                              // 1️⃣ temp pointer list traverse karne ke liye

        while (temp != null && temp.next != null){     // 2️⃣ jab tak current & next node exist karte ho
            if(temp.data == temp.next.data){           // 3️⃣ duplicate mila
                temp.next = temp.next.next;            // 4️⃣ duplicate skip kar diya
            }

            if(temp.next == null) return head;         // 5️⃣ agar next null hai → end of list

            if(temp.data != temp.next.data){           // 6️⃣ agar duplicate nahi mila to aage badho
                temp = temp.next;                      // 7️⃣ next node pe chalo
            }
        }

        return head;                                    // 8️⃣ final head return karo
    }


    public static void display(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null\n");
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(4);
        Node f = new Node(4);
        Node g = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;

        Node ans = remmoveDup(a);
        display(ans);
    }
}
