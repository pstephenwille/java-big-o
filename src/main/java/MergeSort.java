package main.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public final class MergeSort {
    public MergeSort() {
    }

    public static int[] mergeSort(int[] list) {
        if (list.length == 1) {
            return list;
        } else {
            int middle = list.length >> 1;
            int[] left = Arrays.copyOfRange(list, 0, middle);
            int[] right = Arrays.copyOfRange(list, middle, list.length);
            return merge(mergeSort(left), mergeSort(right));
        }
    }

    private static int[] merge(int[] left, int[] right) {
        int[] sorted = new int[left.length + right.length];
        int indexL = 0;
        int indexR = 0;

        while(indexL < left.length && indexR < right.length) {
            if (left[indexL] < right[indexR]) {
                sorted[sorted.length - 1] = left[indexL++];
            } else {
                sorted[sorted.length - 1] = right[indexR++];
            }
        }

        return IntStream.concat(Arrays.stream(left), Arrays.stream(right)).toArray();
    }
}
