package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class KthSmallestElementInBST {

    private int solution(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        list = inorderTraversal(root, list);
        return list.get(k - 1);
    }

    private List<Integer> inorderTraversal(TreeNode root, List<Integer> list) {
        if (root != null) {
            inorderTraversal(root.left, list);
            list.add(root.val);
            inorderTraversal(root.right, list);
        }
        return list;
    }

    private int iterativeSolution(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0) {
                return root.val;
            }
            root = root.right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.bstInsert(root, 1);
        root.bstInsert(root, 4);
        root.bstInsert(root, 2);
        System.out.println(new BinaryTreeLevelOrderTraversal()
                .levelOrder(root));
        System.out.println(new KthSmallestElementInBST()
                .solution(root, 1));
        System.out.println(new KthSmallestElementInBST()
                .iterativeSolution(root, 2));
    }
}
