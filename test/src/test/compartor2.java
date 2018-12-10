package test;
import java.util.*;
import static java.util.Comparator.*;
public class compartor2 {
	private String firstName;
	private String lastName;
	private Integer zipCode;
public compartor2(String firstName, String lastName, Integer zipCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.zipCode = zipCode;
}
public String toString() {
return String.format("Person(%s %s, %d)", firstName, lastName, zipCode);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List persons = Arrays.asList(
		new compartor2("sad","so",804),	
		new compartor2("happt","so",804),	
		new compartor2("ard","so",804)
		);
		persons.sort(
				Comparator.<compartor2, String>comparing(p -> p.lastName)
				.thenComparing(p -> p.firstName)
				.thenComparing(p -> p.zipCode)
		);
	}
}
