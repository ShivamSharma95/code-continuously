import java.util.List;

public class SnakeInMatrix {
    public static void main(String[] args) {

        System.out.println(new Solution().finalPositionOfSnake(3, List.of("DOWN", "RIGHT", "UP")));
        System.out.println(new Solution().finalPositionOfSnake(2, List.of("RIGHT", "DOWN")));

    }

    static class Solution {
        public int finalPositionOfSnake(int n, List<String> commands) {
            int row = 0, col = 0;
            for (String command : commands) {
                switch (command) {
                    case "RIGHT":
                        col++;
                        break;
                    case "LEFT":
                        col--;
                        break;
                    case "UP":
                        row--;
                        break;
                    case "DOWN":
                        row++;
                        break;
                }
            }
            return (row * n) + col;
        }
    }
}
