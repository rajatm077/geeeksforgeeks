import java.util.*;
import java.lang.*;
import java.io.*;

class BST {
    BST left;
    BST right;
    int data;

    public BST() {
        data = -1;
        left = right = null;
    }

    public BST(int data) {
        this.data = data;
        left = right = null;
    }

}

class GFG {
    static BST root;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] preorder = new int[in.length];
            root = new BST(Integer.parseInt(in[0]));
            for (int i = 0; i < in.length; i++) {
                preorder[i] = Integer.parseInt(in[i]);
                if (i != 0) {
                    BST node = new BST(preorder[i]);
                    insertNode(node);
                }
            }
            printPostorder(root);
            System.out.println();

        }
}

    private static void printPostorder(BST root) {
        if (root == null) return;
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.data + " ");
    }

    private static void insertNode(BST node) {
        BST r = root;
        while (r != null) {
            if (r.data < node.data) {
                if (r.right == null) r.right = node;
                else {
                    r = r.right;
                    continue;
                }
            } else {
                if (r.left == null) r.left = node;
                else r = r.left;
            }
        }

    }
}