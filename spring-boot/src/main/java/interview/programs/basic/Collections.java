package interview.programs.basic;
import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("easdasdasd");
		list.add("asd");

		printList(list);

	}

	private static void printList(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("element is -> " + list.get(i));
		}

	}

}
