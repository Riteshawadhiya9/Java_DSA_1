package Linked_List.Questions;

public class Q9_LC_21_Merge2LL {

    public static Node merge2LlOptimal(Node list1 , Node list2){
        Node t1 = list1;                        // 1️⃣ list1 ke traversal ke liye pointer
        Node t2 = list2;                        // 2️⃣ list2 ke traversal ke liye pointer

        Node head = new Node(-1);              // 3️⃣ Dummy node create ki final merged list ke liye
        Node t = head;                         // 4️⃣ Final list me nodes jodne ke liye temp pointer

        while (t1 != null && t2 != null){      // 5️⃣ Jab tak dono lists me elements hai
            if(t1.data < t2.data){             // 6️⃣ list1 ka data chhota hai
                t.next = t1;                   // 7️⃣ list1 ka node directly attach kar diya
                t = t1;                        // 8️⃣ t ko aage badha diya
                t1 = t1.next;                  // 9️⃣ list1 me bhi aage badh gaye
            }else{                             // 🔁 list2 ka data chhota ya barabar hai
                t.next = t2;                   // 🔟 list2 ka node directly attach
                t = t2;                        // 1️⃣1️⃣ t ko aage badhaya
                t2 = t2.next;                  // 1️⃣2️⃣ list2 me aage gaye
            }
        }

        if(t1 == null){                        // 1️⃣3️⃣ Agar list1 khatam ho gayi
            t.next = t2;                       // 1️⃣4️⃣ list2 ke bache hue nodes attach kar diye
        }else{                                 // 1️⃣5️⃣ Agar list2 khatam ho gayi
            t.next = t1;                       // 1️⃣6️⃣ list1 ke bache hue nodes attach kar diye
        }

        Node ans = head.next;                  // 1️⃣7️⃣ Dummy node skip karke final list ka head return
        return ans;
    }


    public static Node merege2LL(Node list1 , Node list2){ // Brute Force
        Node temp1 = list1;                            // 1️⃣ list1 traverse karne ke liye pointer
        Node temp2 = list2;                            // 2️⃣ list2 traverse karne ke liye pointer

        Node head = new Node(-1);                      // 3️⃣ Dummy node banayi (final list ke starting ke liye)
        Node temp = head;                              // 4️⃣ temp use hoga final list banane ke liye

        while(temp1 != null && temp2 != null){         // 5️⃣ Jab tak dono list me elements hai
            if(temp1.data < temp2.data){               // 6️⃣ list1 ka data chota hai
                Node a = new Node(temp1.data);         // 7️⃣ ek new node banao list1 ke data se
                temp.next = a;                         // 8️⃣ usko final list me jod do
                temp = a;                              // 9️⃣ temp ko aage badhao
                temp1 = temp1.next;                    // 🔟 list1 me bhi aage badho
            }else{                                     // 🔁 list2 ka data chota ya barabar hai
                Node a = new Node(temp2.data);         // 1️⃣1️⃣ new node list2 ke data se
                temp.next = a;                         // 1️⃣2️⃣ usko list me jodo
                temp = a;                              // 1️⃣3️⃣ temp aage
                temp2 = temp2.next;                    // 1️⃣4️⃣ list2 me aage
            }
        }

        if(temp1 == null){                             // 1️⃣5️⃣ Agar list1 khatam ho gayi
            temp.next = temp2;                         // 1️⃣6️⃣ list2 ke bache hue nodes jod do
        }else{                                         // 1️⃣7️⃣ list2 khatam ho gayi
            temp.next = temp1;                         // 1️⃣8️⃣ list1 ke bache hue nodes jod do
        }

        return head.next;                              // 1️⃣9️⃣ dummy ke next se actual list start hoti hai
    }

    public static void display(Node head){
        Node temp = head;                              // 🔁 List print karne ke liye
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null\n");
    }

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;                          // 📦 Constructor
        }
    }

    public static void main(String[] args) {
        // List-1: 1 → 3 → 5 → 7 → 9 → 11
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(9);
        Node f = new Node(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // List-2: 2 → 4 → 6 → 8 → 10
        Node p = new Node(2);
        Node q = new Node(4);
        Node r = new Node(6);
        Node s = new Node(8);
        Node t = new Node(10);
        p.next = q;
        q.next = r;
        r.next = s;
        s.next = t;

//        Node ans = merege2LL(a, p);                   // ✅ Merge the two sorted lists
//        display(ans);                                 // 🖨️ Print final merged list

        Node ans1 = merge2LlOptimal(a,p);
        display(ans1);
    }
}
