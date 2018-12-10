package Lambda;

import java.util.*;

public class ForEach {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Justin", "Monica", "Irene");
		names.forEach(out::peintln);
		new HashSet(names).forEach(out::println);
		new ArrayDeque(names).forEach(out::println);
	}
	
	public static void forEach(Iterable iterable) {
		for(Object o : iterable) {
			System.out.println(o);
		}
	}
}