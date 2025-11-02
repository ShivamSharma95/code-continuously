import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
//        System.out.println(new Solution().candy(new int[]{1, 0, 2}));
//        System.out.println(new Solution().candy(new int[]{1, 2, 2}));
        System.out.println(new Solution().candy(new int[]{1, 2, 87, 87, 87, 2, 1}));
    }


    static class Solution {
        public int candy(int[] ratings) {
            if (ratings.length == 1) return 1;
            var candies = new int[ratings.length];
            Arrays.fill(candies, 1);
            for (int i = 1; i < ratings.length; i++) {
                if (ratings[i] > ratings[i-1]) {
                    candies[i] = candies[i-1] + 1;
                }
            }
            for (int i = ratings.length-2; i >=0; i--) {
                if (ratings[i] > ratings[i+1]) {
                    candies[i] = candies[i+1] + 1;
                }
            }
            var result = 0;
            for (int candy : candies) {
                result += candy;
            }
            return result;
        }
    }


}
