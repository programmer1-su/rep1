package rep1;

public class Square1 {
	private int width;//instance variables(fields)
	public static int height = 50;//class variables(fields)
	
	public Square1(int width) {
		int  area = 20;//local variables
		this.width = width;
		System.out.println("Width is " + this.width);
	}
	/*
	 * Variables scopes
	 * 1.instance variables
	 * 2.class variables
	 * 3.local variables
	 */
}
