package Binary_Tree;

public class Implementation {
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        //          3
        //        /   \
        //       4     2
        //      / \   / \
        //     -1  1  6  9
        //    / \ / \ / \ / \
        //    n n n n n n n n
        Node a = new Node(3); // root
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(0);
        Node f = new Node(0);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);
        System.out.println();
        System.out.println("Size of the Tree is : "+size(a)); // size --> total no.of nodes
        System.out.println("Sum of the Tree is : "+Sum(a));
        System.out.println("Product of the Tree is : "+Product(a));
        System.out.println("Product of the Tree with for non-zero element : "+ProductNonZero(a));
        System.out.println("Find Maximum Value from the Tree : " + findMax(a));
        System.out.println("Find Minimum Value from the Tree : " + findMin(a));
        System.out.println("Levels of the tree : "+ findLevel(a));




    }

    private static void display(Node root){
        if(root == null) return;

//        // Pre-order traversal
//        System.out.print(root.data+" ");
//        display(root.left);
//        display(root.right);


//        // In-order traversal
//        display(root.left);
//        System.out.print(root.data+" ");
//        display(root.right);


        // Post-order traversal
        System.out.print(root.data+" ");
        display(root.right);
        display(root.left);

    }

    private static int size(Node root){
        if(root == null) return  0;
        return 1+ size(root.left) + size(root.right);
    }

    private static int Sum(Node root){
        if(root == null) return 0;
        return root.data + Sum(root.left) + Sum(root.right);
    }
    private static int Product(Node root){
        if(root == null) return 1;
        return root.data * Product(root.left) * Product(root.right);
    }
    private static int ProductNonZero(Node root){
        if(root == null) return 1;

        if(root.data == 0) {
            return ProductNonZero(root.left) * ProductNonZero(root.right);
        }

        return root.data * ProductNonZero(root.left) * ProductNonZero(root.right);
    }

    private static int findMax(Node root){
        if(root == null) return Integer.MIN_VALUE;

        return Math.max(root.data , Math.max(findMax(root.left) , findMax(root.right)));
    }

    private static int findMin(Node root){
        if(root == null) return Integer.MAX_VALUE;

        return Math.min(root.data , Math.min(findMin(root.left) , findMin(root.right)));
    }

    private static int findLevel(Node root){
        if(root == null) return 0;
        return 1 + Math.max(findLevel(root.left) , findLevel(root.right));
    }
}
