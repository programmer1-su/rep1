package rep1;

public class Keyword {
	
	public int width = 50;//クラスvariable|fields
	
	public Keyword(int width/*method variable*/) {
		System.out.println("Method variable width value is " + width);
		System.out.println("Class variable width value is " + this.width);
		this.width = width;
		System.out.println("Reasssign Value of class variable width value is " + this.width);
	}
	

}
