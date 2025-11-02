import Model.TreeNode;

public class ConvertSortedArrayToBinarySearch {
    public static void main(String[] args) {
        System.out.println(new Solution().sortedArrayToBST(new int[]{0,1,2,3,4,5}));

    }

    static class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            int mid = nums.length / 2;
            var root = new TreeNode(nums[mid]);
            if (nums.length > 1) {
                root.left = new TreeNode();
                root.right = new TreeNode();
                if (mid == nums.length - 1) {
                    root.right = null;
                    root.left.val = nums[mid-1] ;
                }else{
                }
            }
            return root;
        }


    }
}
