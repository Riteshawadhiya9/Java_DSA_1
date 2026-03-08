package Binary_Tree;



public class Q_2_LC_226_Inverted_Tree {
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
         //          4
        //         /   \
        //        2     7
        //       / \   / \
        //      1   3 6   9
        Node a = new Node(4);
        Node b = new Node(2);
        Node c = new Node(7);
        Node d = new Node(1);
        Node e = new Node(3);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        System.out.println("Before Inversion:");
        display(a);

        // Capture returned root
        a = invertTree(a);

        System.out.println("\nAfter Inversion:");
        display(a);

    }
    private static void display(Node root){
         if(root == null) return;

        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
    }

    public static Node invertTree(Node root){
         if(root == null) return null ;


        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
