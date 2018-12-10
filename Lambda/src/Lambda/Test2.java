package Lambda;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Justin","caterpillar","Bush"};
		//Arrays.sort(names, (name1, name2)->StringOrder.byLength(name1, name2));
		//Arrays.sort(names, StringOrder::byLength);
		//Arrays.sort(names, StringOrder::byLexicography);
		//Arrays.sort(names, StringOrder::byLexicographyIgnoreCase);
		Arrays.sort(names, String::compareTo);
		for (String name : names) {
			System.out.println(name);
		}
	}

}
