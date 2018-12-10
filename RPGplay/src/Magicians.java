/*
ProgramName : Magicians Role
Author : antallen
Date : 2018/10/22
Version: 0.1
*/

package newworld.roles;

public class Magicians extends Role implements Securesor{
	
	
	public Magicians(String name, int blood, int level){
		this.name = name;
		this.blood = blood;
		this.level = level;
	}

	@Override
	public void fight(){
		System.out.print("魔法攻擊");
	}
	@Override
	public String toString(){
		return "魔法師: " + super.toString();
	}
	@Override
	public void secure(){
		System.out.print("魔法治療");
	}
		
}