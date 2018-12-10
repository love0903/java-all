public class Chicken extends Bird{

	public Chicken (String name){
		super(name);
	}

	public static Chicken copy(){
		Chicken chicken = new Chicken("Ken");
		chicken.name = "Peter";
		return chicken;
	}
}