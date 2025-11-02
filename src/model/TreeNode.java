//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Model;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return this.toStringHelper("", true);
    }

    private String toStringHelper(String prefix, boolean isTail) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append(isTail ? "└── " : "├── ").append(this.val).append("\n");
        if (this.left != null || this.right != null) {
            if (this.left != null) {
                sb.append(this.left.toStringHelper(prefix + (isTail ? "    " : "│   "), false));
            } else {
                sb.append(prefix).append(isTail ? "    " : "│   ").append("├── null\n");
            }

            if (this.right != null) {
                sb.append(this.right.toStringHelper(prefix + (isTail ? "    " : "│   "), true));
            } else {
                sb.append(prefix).append(isTail ? "    " : "│   ").append("└── null\n");
            }
        }

        return sb.toString();
    }

    public static TreeNode getTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        return root;
    }

    public static TreeNode getTreeForPathSumUseCase() {
        Integer[] arr = new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        return buildTreeFromLevelOrder(arr);
    }

    private static TreeNode buildTreeFromLevelOrder(Integer[] arr) {
        if (arr.length != 0 && arr[0] != null) {
            TreeNode root = new TreeNode(arr[0]);
            Queue<TreeNode> queue = new LinkedList();
            queue.add(root);

            for(int i = 1; i < arr.length; ++i) {
                TreeNode current = (TreeNode)queue.poll();
                if (i < arr.length && arr[i] != null) {
                    current.left = new TreeNode(arr[i]);
                    queue.add(current.left);
                }

                ++i;
                if (i < arr.length && arr[i] != null) {
                    current.right = new TreeNode(arr[i]);
                    queue.add(current.right);
                }
            }

            return root;
        } else {
            return null;
        }
    }
}
