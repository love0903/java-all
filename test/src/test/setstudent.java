package test;
import java.util.*;
class Student{
	private String name;
	private String number;
	Student(String name, String number){
		this.name = name;
		this.number = number;
	}
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 47 * hash + Objects.hashCode(this.name);
		hash = 47 * hash + Objects.hashCode(this.number);
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		final Student other =(Student) obj;
		if(!Objects.equals(this.name, other.name)) {
			return false;
		}
		if(!Objects.equals(this.name, other.number)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return String.format("(%s,%s)",name,number);
	}
}
public class setstudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new HashSet<>();
		set.add(new Student("abc","a123"));
		set.add(new Student("abd","a124"));
		set.add(new Student("abg","a123"));
		System.out.println(set);
	}

}
