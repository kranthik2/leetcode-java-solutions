package trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {


    //recursive solution
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    //Iterative Solution
    public int maxDepthIterative(TreeNode root) {
        int depth = 0;
        if (root != null) {
            Queue<TreeNode> q = new ArrayDeque<>();
            q.offer(root);
            while (!q.isEmpty()) {
                int size = q.size();
                depth++;
                for (int i = 0; i < size; i++) {
                    TreeNode current = q.poll();
                    if (current != null) {
                        if (current.left != null) {
                            q.offer(current.left);
                        }
                        if (current.right != null) {
                            q.offer(current.right);
                        }
                    }
                }
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(new MaximumDepthOfBinaryTree().maxDepthIterative(root));
    }

}
