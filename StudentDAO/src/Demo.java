import java.util.Scanner;
import java.util.List;
import java.sql.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		StudentDAO dao = new StudentDAO();
		System.out.print("Please input the Function number:1) ADD Student\n 2) Show Students");
		int input = scanner.nextInt();
		switch (input) {
		case 1:
			add(student, scanner,dao);
			 break;
		case 2:
			get(dao);
			break;
		default:
			break;
		}
		System.out.println("quit");
	}

	private static void get(StudentDAO dao) {
		// TODO Auto-generated method stub
		List<Student> resultList = dao.getData();
		resultList.iterator().toString();
	}

	private static void add(Student student,Scanner scanner, StudentDAO dao) {
		// TODO Auto-generated method stub
		System.out.print("please input the student's name:");
		student.setName(scanner.next());
		System.out.print("please input the student's sid:");
		student.setSid(scanner.next());
		System.out.print("please input the student's addresses:");
		student.setAddresses(scanner.next());
		System.out.print("please input the student's sex:");
		student.setAddresses(scanner.next());
		dao.add(student);
	}

}
