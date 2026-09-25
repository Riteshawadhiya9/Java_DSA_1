package Binary_Tree;

public class Kth_level_of_BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void printKthLevel(Node root , int k){
        if(root == null) return;

        if(k == 1){
            System.out.print(root.data+" ");
            return;
        }
        printKthLevel(root.left , k-1);
        printKthLevel(root.right, k-1);
    }
    public static void main(String[] args) {
        //                         1
        //                      /     \
        //                     2       3
        //                   /  \     / \
        //                  4    5   6   7
        //                 / \    \     /
        //                8   9    10   11
        //                   / \       / \
        //                  12 13     14 15
        //                         \
        //                         16

        Node a  = new Node(1);
        Node b  = new Node(2);
        Node c  = new Node(3);
        Node d  = new Node(4);
        Node e  = new Node(5);
        Node f  = new Node(6);
        Node g  = new Node(7);
        Node h  = new Node(8);
        Node i  = new Node(9);
        Node j  = new Node(10);
        Node k  = new Node(11);
        Node l  = new Node(12);
        Node m  = new Node(13);
        Node n  = new Node(14);
        Node o  = new Node(15);
        Node p  = new Node(16);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        d.left = h;
        d.right = i;

        e.right = j;

        g.left = k;

        i.left = l;
        i.right = m;

        k.left = n;
        k.right = o;

        m.right = p;

        int kth = 3;

        System.out.print("All Kth Level Elem : ");
        printKthLevel(a,kth);

    }
}
