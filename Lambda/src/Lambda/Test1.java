package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		Comparator<String> byLength = new Comparator<String>() {  
		    public int compare(String name1, String name2) {
		        return name1.length() - name2.length();
		    }
		};
		*/
		Comparator<String> byLength = (String name1, String name2) -> name1.length() - name2.length();
		
		
		String[] names = {"Justin", "caterpillar", "Bush"};
		/*
		Arrays.sort(names, new Comparator<String>() {
		    public int compare(String name1, String name2) {
		        return name1.length() - name2.length();
		    }
		});
		*/
		Arrays.sort(names, byLength);
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
