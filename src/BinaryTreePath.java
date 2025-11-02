import java.util.ArrayList;
import java.util.List;

import Model.TreeNode;

public class BinaryTreePath {
    public static void main(String[] args) {
        for (int i = -100; i < 100; i++) {
            System.out.println(i + " = " + ((int) Math.log10(Math.abs(i)) + 1));

        }
//        System.out.println(TreeNode.getTree());
//        System.out.println(new Solution().binaryTreePaths(TreeNode.getTree()));
    }

    static /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            var result = new ArrayList<String>();
            var current = new StringBuilder();
            current.append(root.val);
            binaryTreeHelper(root.left, root.right, result, current);
            return result;

        }

        void binaryTreeHelper(TreeNode left, TreeNode right, List<String> result, StringBuilder current) {
            if (left == null && right == null) {
                result.add(current.toString());
            }
            if (left != null) {
                current.append("->").append(left.val);
                binaryTreeHelper(left.left, left.right, result, current);
                current.delete(getNewStart(left.val, current), current.length());
            }
            if (right != null) {
                current.append("->").append(right.val);
                binaryTreeHelper(right.left, right.right, result, current);
                current.delete(getNewStart(right.val, current), current.length());
            }

        }

        private int getNewStart(int val, StringBuilder current) {
            var valueLength = ((int) Math.log10(Math.abs(val)) + 1);
            return (val < 0 ? current.length() - valueLength - 3 : current.length() - valueLength - 2);
        }


    }
}
