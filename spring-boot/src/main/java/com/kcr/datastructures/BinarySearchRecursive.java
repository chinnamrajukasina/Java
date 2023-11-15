package com.kcr.datastructures;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 5}; // Make sure the array is sorted for binary search.
        int target = 5; // Set the target value you want to search for.
        int result = binarySearchRecursive(numbersArray, target, 0, numbersArray.length - 1);

        if (result != -1) {
            System.out.printf("Target %d is found at index %d in numbersArray%n", target, result);
        } else {
            System.out.printf("Target %d is not found in numbersArray%n", target);
        }
    }

    private static int binarySearchRecursive(int[] numbersArray, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbersArray[mid] == target) {
                return mid; // Target found at index mid
            } else if (numbersArray[mid] < target) {
                return binarySearchRecursive(numbersArray, target, mid + 1, right);
            } else {
                return binarySearchRecursive(numbersArray, target, left, mid - 1);
            }
        }

        return -1; // Target not found in the array
    }
}
