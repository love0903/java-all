/*
ProgramName: Play Demo
Author: antallen
*/

import newworld.roles.*;
import java.util.Scanner;

public class Demo implements Action{

	public static void main(String[] args){
		
		SwordsMan s1 = new SwordsMan("Peter",100,1);
		Magicians m1 = new Magicians("Juli",50,1);
							
		showBlood(s1);
		showBlood(m1);

		Scanner scanner = new Scanner(System.in);
		int action = 0;
		int i = 0;
		do {
			System.out.print("�п�J���ʤ�V: (0: stop, 1:right, 2:left, 3:up, 4:down ) " );
			action = scanner.nextInt();
			if (action == 0)
				break;
			
			i = (int)(Math.random()*10);
			
			
			play(action);
		} while(true);
	}
	public static void play(int action){
		switch (action){
			case Action.STOP:
				System.out.println("�����...");
				break;
			case Action.RIGHT:
				System.out.println("�V�k����...");
				break;
			case Action.LEFT:
				System.out.println("�V������...");
				break;
			case Action.UP:
				System.out.println("�V�W����...");
				break;
			case Action.DOWN:
				System.out.println("�V�U����...");
				break;
			default:
				assert false :"�D�w�q���`��";
		}
	}
	
	public static void showBlood(Role r1){
		System.out.printf("%s : ��q -> %d%n", r1.getName(), r1.getBlood());
	}
		
	public static void drawFight(Role r2){
		System.out.printf("%s ���� %s",r2.getName());
		r2.fight();
	}
	
	public static void drawScure(Role r2, Role r3){
		System.out.printf("%s",r2.getName());
		((Magicians)r2).secure();
		System.out.printf("%s",r3.getName());
		
	}
}