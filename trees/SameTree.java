package trees;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {

    //Solution1
    public boolean recursiveSolution(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return recursiveSolution(p.left, q.left) && recursiveSolution(p.right, q.right);
    }

    //Solution 2
    public boolean iterativeSolution(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(a);
        queue.offer(b);
        while (!queue.isEmpty()) {
            TreeNode first = queue.poll();
            TreeNode second = queue.poll();
            if (first == null && second == null) {
                continue;
            }
            if (first == null || second == null) {
                return false;
            }
            if (first.val == second.val) {
                queue.offer(first.left);
                queue.offer(second.left);
                queue.offer(first.right);
                queue.offer(second.right);
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(3);
        System.out.println(new SameTree().iterativeSolution(p, p));
        System.out.println(new SameTree().iterativeSolution(p, q));
    }
}
