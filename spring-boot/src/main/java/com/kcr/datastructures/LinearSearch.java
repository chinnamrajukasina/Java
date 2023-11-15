package com.kcr.datastructures;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbersArray = {1, 22, 344, 554, 99};
        int target = 99;
        int result = linearSearch(numbersArray, target);
        if (result != -1) {
            System.out.printf("Target %d is found in numbersArray%n", result);
        } else {
            System.out.printf("Target %d is not found in numbersArray%n", target);
        }
    }

    private static int linearSearch(int[] numbersArray, int target) {
        for (int number : numbersArray) {
            if (number == target)
                return number; // Return the target number itself when found
        }

        return -1; // Target not found in the array
    }
}
