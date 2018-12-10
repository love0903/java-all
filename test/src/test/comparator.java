package test;
import java.util.*;
import static java.util.Comparator.*;
public class comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List words = Arrays.asList("B", "X", "A", "M", null ,"F", "W", "O", null);
		words.sort(nullsFirst(reverseOrder()));
		System.out.println(words);
	}

}
