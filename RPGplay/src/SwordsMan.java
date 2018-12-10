/*
ProgramName : SwordsMan Role
Author : antallen
Date : 2018/10/22
Version: 0.1
*/
package newworld.roles;

public class SwordsMan extends Role{

	final int age;
	
	public SwordsMan(String name, int blood, int level){
		super(name, blood);
		this.level = level;
		this.age = 10;
	}
	
	@Override
	public void fight(){
		System.out.print("���C������....");
	}
	@Override
	public String toString(){
		return "�C�h: " + super.toString();
	}
	
}