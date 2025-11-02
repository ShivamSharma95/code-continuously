import java.util.Arrays;

public class NumberOfBeams {
    public static void main(String[] args) {
        System.out.println(new Solution().numberOfBeams(new String[]{"011001", "000000", "010100", "001000"}));
    }

    static class Solution {
        public int numberOfBeams(String[] bank) {
            if(bank.length == 0){return 0;}
            StringBuilder previousFloor = new StringBuilder();
            int numberOfBeams = 0;
            Arrays.stream(bank).forEach(v->v.replaceAll("0",""));
            for (String floor : bank) {
                if (!floor.isEmpty()) {
                    numberOfBeams += (floor.length() * previousFloor.length());
                    previousFloor.setLength(0);
                    previousFloor.append(floor);
                }
            }
            return numberOfBeams;
        }
    }
}
