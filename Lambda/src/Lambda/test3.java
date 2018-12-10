package Lambda;
import static java.lang.System.out;
class Hello{
Runnable r1 =() -> out.println(this);
Runnable r2 =() -> out.println(toString());
	public String toString() {
		return "Hello, world!";
	}
}
public class test3 {
	public static void main(String[] args) {
		new Hello().r1.run();
		new Hello().r2.run();
	}
}
