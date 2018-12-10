public class Bird{
	protected String name;
	public Bird(name){
		this.name = name;
	}

	public static Bird copy(){
		return new Bird(name);
	}

}