import java.util.Arrays;

public class PartitionArrayAccordingToPivot {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().pivotArray(new int[]{4,0,4,5,-11}, 5)));
    }

    static class Solution {
        public int[] pivotArray(int[] nums, int pivot) {
            int i = 0, j = nums.length - 1;
            while (i < j) {
                if (nums[i] > nums[j]) {
                    swap(nums, i, j);
                }
                i++;
                j--;

            }
            i = 0;
            j = nums.length - 1;
            while (i < j) {
                if (nums[i] > pivot) {
                    swap(nums, i, j);
                    j--;
                }
                i++;

            }
//            i = 0;
//            j = 1;
//            while (j < nums.length - 1) {
//                if(nums[j] == pivot){break;}
//                if (nums[i] < nums[j]) {
//                    swap(nums, i, j);
//                }
//                j++;
//                i++;
//            }
            return nums;
        }

        void swap(int[] nums, int i, int j) {
            var temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

}
