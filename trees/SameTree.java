package trees;

public class SameTree {

    public boolean solution(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return solution(p.left, q.left) && solution(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(3);
        System.out.println(new SameTree().solution(p, p));
        System.out.println(new SameTree().solution(p, q));
    }
}
