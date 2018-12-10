/*
ProgramName : Role
Author : antallen
*/
package newworld.roles;

public abstract class Role implements Fighter{

	protected int blood;
	protected int level;
	protected String name;
	
	public Role(){}
	
	public Role(String name){
		this.name = name;
	}
	public Role(String name,int blood){
		this(name);
		this.blood = blood;
	}
	public Role(String name,int blood, int level){
		this(name,blood);
		this.level = level;
	}
	
	
	public String toString(){
		return String.format("%s, %d, %d",this.name,this.level,this.blood);
	}
	
	@Override
	public abstract void fight();
	
	public void setLevel(int level){
		this.level += level;
	}
	
	public int getLevel(){
		return this.level;
	}
	
	public void setBlood(int blood){
		this.blood = blood;
	}
	
	public int getBlood(){
		return this.blood;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}