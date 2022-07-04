package trees;

public class TreeNode {
    public int val;

    public TreeNode left, right;

    public TreeNode() {

    }

    public TreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    protected TreeNode bstInsert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        } else if (val < root.val) {
            root.left = bstInsert(root.left, val);
        } else {
            root.right = bstInsert(root.right, val);
        }
        return root;
    }

}
