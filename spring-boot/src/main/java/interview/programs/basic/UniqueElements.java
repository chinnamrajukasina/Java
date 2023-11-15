package interview.programs.basic;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueElements {

	public static void main(String[] args) {

		List<Integer> array1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> array2 = Arrays.asList(3, 4, 5, 6, 7);
		findMergedList(array1, array2);
		findUnion(array1, array2);
		findInterSection(array1, array2);
		findSymmetricDifference(array1,array2);

	}

	private static void findSymmetricDifference(List<Integer> array1, List<Integer> array2) {
		List<Integer> union = Stream.concat(array1.stream(), array2.stream()).toList();
		List<Integer> inter = array1.stream().filter(array2::contains).toList();
List<Integer> delta = union.stream().filter(e->!inter.contains(e)).collect(Collectors.toList());	
System.out.println(delta);
	}

	private static void findInterSection(List<Integer> array1, List<Integer> array2) {
		List<Integer> inter = array1.stream().filter(array2::contains).collect(Collectors.toList());
		System.out.println(inter);
		}

	private static void findUnion(List<Integer> array1, List<Integer> array2) {
		Set<Integer> unionArray = Stream.concat(array1.stream(), array2.stream()).collect(Collectors.toSet());
		System.out.println(unionArray);
	}

	private static void findMergedList(List<Integer> array1, List<Integer> array2) {
		List<Integer> mergedList = Stream.concat(array1.stream(), array2.stream()).collect(Collectors.toList());
		System.out.println(mergedList);

	}
}
