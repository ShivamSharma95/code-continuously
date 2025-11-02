import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        var array = new int[]{2, 10, 3, 9};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    static void mergeSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        var mid = start + (end - start) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);
        merge(array, start, mid, end, array.length);
    }

    private static void merge(int[] array, int start, int mid, int end, int n) {
        var left = new int[mid - start + 1];
        var right = new int[end - mid];
        for (int i = 0; i < left.length; i++) {
            left[i] = array[start + i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = array[mid + i + 1];
        }
        int i = 0, j = 0, k = start;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
