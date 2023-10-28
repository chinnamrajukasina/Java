package arrays.collections.exceptions.treads;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = getNEvenNums(10);
        print(arrayList);
    }

    private static void print(ArrayList<Integer> arrayList) {
        System.out.println(arrayList);
    }

    private static ArrayList<Integer> getNEvenNums(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0, count = 0; count < n; i++) {
            if (isEven(i)) {
                result.add(i);
                count++;
            }
        }
        return result;
    }

    private static boolean isEven(int i) {
        return (i % 2 == 0);
    }
}
