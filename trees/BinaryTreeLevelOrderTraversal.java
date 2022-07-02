package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root != null) {
            Queue<TreeNode> q = new ArrayDeque<>();
            q.offer(root);
            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode current = q.poll();
                    if (current != null) {
                        list.add(current.val);
                        if (current.left != null) {
                            q.offer(current.left);
                        }
                        if (current.right != null) {
                            q.offer(current.right);
                        }
                    }
                }
                result.add(list);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(new BinaryTreeLevelOrderTraversal().levelOrder(root));
        System.out.println(new BinaryTreeLevelOrderTraversal().levelOrder(null));
    }
}
