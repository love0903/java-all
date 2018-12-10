class Some{
	Some(int i){
		System.out.println("©I¥s Some(int i)");
	}
}
class Other extends Some{
	Other(){
		//super();
		super(10);
		System.out.println("©I¥s Other()");
	}
}