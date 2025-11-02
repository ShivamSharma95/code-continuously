import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LastStoneWeight {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{7, 6, 7, 6, 9}));
    }

    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];
        int i = stones.length - 2, j = 0;
        Arrays.sort(stones);
        while (j < stones.length - 1) {
            stones[i] = Math.abs(stones[i] - stones[i + 1]);
            stones[i + 1] = 0;
            Arrays.sort(stones);
            j++;
        }
        return stones[stones.length - 1];
    }
}
