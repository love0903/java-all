package test;
import java.util.*;
import static java.lang.System.out;
public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		collectNameTo(names);
		out.println("訪客名單: ");
		printUpperCase(names);
	}
static void collectNameTo(List<String> names) {
	Scanner scanner = new Scanner(System.in);
	String name;
	while(true) {
		out.print("訪客名單: ");
		name = scanner.nextLine();
		if(name.equals("quit")) {
			break;
		}
		names.add(name);
	}
}
static void printUpperCase(List<String> names) {
	for(int i = 0;i < names.size(); i++) {
		String name = names.get(i);
		out.println(name.toUpperCase());
	}
}

}
