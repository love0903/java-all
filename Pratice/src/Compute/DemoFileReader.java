package Compute;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoFileReader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileUtil fileutil = new FileUtil();
		System.out.print("Please input the file name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.printf("The Context of the file: %s", fileutil.readFile(name));
	}

	
}
