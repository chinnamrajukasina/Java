package com.kcr.datastructures;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] unSorted = {3, 2, 45, 33, 32, 12};
        System.out.println(Arrays.toString(unSorted) + " (unsorted array)");
        int[] sorted = bubbleSort(unSorted);
        System.out.println(Arrays.toString(sorted) + " (sorted array)");
    }

    private static int[] bubbleSort(int[] unSorted) {
        for (int i = 0; i < unSorted.length - 1; i++) {
            for (int j = 0; j < unSorted.length - 1 - i; j++) {
                if (unSorted[j] > unSorted[j + 1]) {
                    // Swap unSorted[j] and unSorted[j + 1]
                    int temp = unSorted[j];
                    unSorted[j] = unSorted[j + 1];
                    unSorted[j + 1] = temp;
                }
            }
        }
        return unSorted;
    }
}
