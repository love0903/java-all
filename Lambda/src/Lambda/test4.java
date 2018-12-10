package Lambda;
import java.util.Arrays;
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Justin", "Monica", "Irene");
		names.forEach(out::println);
		new HashSet(names).forEach(out::println);
		new ArrayDeque(names).forEach(out::println);
	}

}
