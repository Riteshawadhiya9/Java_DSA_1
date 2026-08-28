package Linked_List.Questions;

public class LC_203_Remove_Linked_List_Elements {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
    }
    public static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.data == val) {
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null) {
            if (fast.data == val) {
                slow.next = fast.next;
                fast = fast.next;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(5);
        ListNode g = new ListNode(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        int val = 6;

        display(a);

        display(removeElements(a,val));
    }
}
