package Doubly_Linked_List;

public class Implementation {

    public  static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        System.out.print("null<-");
        while(temp != null){
            System.out.print(temp.data);
            if(temp.prev != null) System.out.print("<-");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void display2(Node random){
        Node temp = random;
        // move this temp backwards to the temp
        while(temp.prev != null){
            temp = temp.prev;
        }
        // now temp is at head
        // print the list
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public static Node insertionAtHead(Node head , int val){
        Node temp = new Node(val);
        temp.next = head;
        head.prev = temp;
        head = temp;
        return head;
    }

    public static void insertAtTail(Node head , int val){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node t = new Node(val);
        temp.next = t;
        t.prev = temp;
    }

    public static void insertAt(Node head , int idx , int val){
        Node s = head;
        for(int i = 0 ; i < idx-1 ; i++){
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(val);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }

    public static Node deleteHead(Node head ){
        head = head.next;
        head.prev = null;
        return head;
    }

    public static Node deleteTail(Node head){
        Node temp = head;
        while(head == null || temp.next != null){
            temp = temp.next;
        }
        temp = temp.prev;
        temp.next = null;
        return head;
    }

    public static void deleteTail2(Node tail){
        tail = tail.prev;
        tail.next = null;
    }

    public static Node deleteAtIdx(Node head , int idx){
        Node temp = head;
        for(int i = 0 ; i < idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        return head;
    }

    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        display(a);

//        displayrev(e);

//        display2(e);

//        Node newHead = insertionAtHead(a,90);
//        display(newHead);

//        insertAtTail(a,56);
//        display(a);

//        insertAt(a,3,95);
//        display(a);

//        Node deleteHead = deleteHead(a);
//        display(deleteHead);

//        Node deleteTail = deleteTail(a);
//        display(deleteTail);

//        deleteTail2(e);
//        display(a);

        Node deleteAt = deleteAtIdx(a,2);
        display(deleteAt);
    }
}
