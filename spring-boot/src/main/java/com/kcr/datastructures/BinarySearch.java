package com.kcr.datastructures;

public class BinarySearch {
	public static void main(String[] args) {
		int[] numbersArray = { 1, 2, 3, 4, 5 }; // Make sure the array is sorted for binary search.
		int target = 5; // Set the target value you want to search for.
		int result = binarySearch(numbersArray, target);

		if (result != -1) {
			System.out.printf("Target %d is found at index %d in numbersArray%n", target, result);
		} else {
			System.out.printf("Target %d is not found in numbersArray%n", target);
		}
	}

	private static int binarySearch(int[] numbersArray, int target) {
		int left = 0, right = numbersArray.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (numbersArray[mid] == target)
				return mid;
			else if (numbersArray[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}
}
