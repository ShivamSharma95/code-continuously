import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        var array = new int[]{3, 4, 6, 1, 8, 2};
        var swap = false;
        for (int i = 0; i < array.length - 1; i++) {
            swap = false;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }

            }
            if(!swap) break;
        }
        System.out.println(Arrays.toString(array));
    }
}
