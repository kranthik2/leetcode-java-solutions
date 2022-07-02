package trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class InvertOrFlipTree {

    public TreeNode invertTreeRecursive(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = invertTreeRecursive(root.left);
        root.left = invertTreeRecursive(root.right);
        root.right = left;
        return root;
    }


    public void invertTreeIterative(TreeNode root) {
        if (root != null) {
            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode current = queue.poll();
                    if (current != null) {
                        TreeNode left = current.left;
                        if (left != null) {
                            queue.offer(left);
                            current.left = current.right;
                        }
                        if (current.right != null) {
                            queue.offer(current.right);
                            current.right = left;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        printTree(root);
        new InvertOrFlipTree().invertTreeIterative(root);
        printTree(root);
    }

    public static void printTree(TreeNode tree) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(tree);
        System.out.print("[");
        while (!q.isEmpty()) {
            int size = q.size();
            System.out.print("[");
            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();
                if (current != null) {
                    System.out.print(current.val);
                    if (current.left != null) {
                        q.offer(current.left);
                    }
                    if (current.right != null) {
                        q.offer(current.right);
                    }
                }
            }
            System.out.print("]");
        }
        System.out.println("]");
    }
}
