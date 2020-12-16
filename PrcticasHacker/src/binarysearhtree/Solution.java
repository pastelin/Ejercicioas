package binarysearhtree;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
import java.util.*;
import java.io.*;

class Node {

    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Solution {

    static Queue<Node> queue = new LinkedList<Node>();

    static void levelOrder(Node root) {
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            Node tree = queue.remove();
            System.out.print(tree.data + " ");

            if (tree.left != null) {
                queue.add(tree.left);
            }
            if (tree.right != null) {
                queue.add(tree.right);
            }
        }
    }

    static int getHeight(Node root) {

        if (root == null) {

            return -1;

        } else {

            return 1 + Math.max(getHeight(root.left), getHeight(root.right));

        }

    }

    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de objetos a crear");
        int T = sc.nextInt();

        Node root = null;
        while (T-- > 0) {
            System.out.println("Ingrese un numero");
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);

        //levelOrder(root);
    }
}
