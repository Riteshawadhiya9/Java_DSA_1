package Binary_Tree;
import java.util.*;
public class Q3_LC_199_Right_View_Of_Binary_Tree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){this.data = data;}
    }
    static List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {
        //          1
        //        /   \
        //       2     3
        //            / \
        //           4   5

        // output -> [1,3,5]
        Node a  = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.left = b; a.right = c;
        c.left = d; c.right = e;
        display(a);
        System.out.println();

        rightView(a, 0);

        System.out.println("Right View: " + ans);
    }
    private static void display(Node root){
        if(root == null) return;

        System.out.print(root.data +" ");
        display(root.right);
        display(root.left);

    }

    static void rightView(Node root, int level) {

        if (root == null) return;

        // first node of this level
        if (level == ans.size()) {
            ans.add(root.data);
        }

        // visit right first
        rightView(root.right, level + 1);
        rightView(root.left, level + 1);
    }

}
