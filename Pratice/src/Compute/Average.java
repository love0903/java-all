package Compute;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scanner = new Scanner(System.in);
			double sum = 0;
			int count = 0;
			int number;
			while (true) {
				try {
					number = scanner.nextInt();
					if (number == 0) {
						break;
					}
					sum += number;
					count++;
				} catch (InputMismatchException e) {
					// TODO Auto-generated catch block
					System.out.printf("Ignore the error input : %s%n",scanner.next());
				}
			}
			System.out.printf("Average: %.2f%n", sum / count);
		
	}
}
