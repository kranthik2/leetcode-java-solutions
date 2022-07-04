package trees;

public class ValidBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        for (int i = 2; i < 9; i++) {
            root.bstInsert(root, i);
        }
        System.out.println(new BinaryTreeLevelOrderTraversal().levelOrder(root));
        System.out.println(new ValidBST().solution(root));
    }

    private boolean solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        return solution(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean solution(TreeNode root, int low, int high) {
        if (root == null) {
            return true;
        }
        if (root.val <= low || root.val >= high) {
            return false;
        }
        return solution(root.left, low, root.val)
                && solution(root.right, root.val, high);
    }
}

