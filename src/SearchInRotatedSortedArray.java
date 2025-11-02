public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
//        System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4));
//        System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5));
//        System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 6));
//        System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7));
        System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1));
        System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2));
        System.out.println(new Solution().search(new int[]{5, 1, 3}, 3));
    }

    static class Solution {
        public int search(int[] nums, int target) {
            if (nums.length == 1) {
                return nums[0] == target ? 0 : -1;
            }
            return search(nums, 0, nums.length - 1, target);
        }

        // [5, 6,7,0,1] 1
        // 0,3,6 4,5,6

        int search(int[] nums, int start, int end, int target) {
            if (start > end) {
                return -1;
            }
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                if (target < nums[start] && target >= nums[end]) {
                    return search(nums, mid + 1, end, target);
                }
                return search(nums, start, mid - 1, target);

            }
            if (target > nums[end] && target <= nums[end]) {
                return search(nums, start, mid - 1, target);
            }
            return search(nums, mid + 1, end, target);
        }
    }
}
