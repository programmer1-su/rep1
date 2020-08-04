package rep1;

public class Statement {

	public static void main(String[] args) {
		
		int x = 20;//x =>20 assignment statement
		
		x++;//increment statement
		
		boolean b = doIt();//method invocation statement
		
		ReferenceTest t = new ReferenceTest();//Object creation statement
		t.reference();
		
		int z;//declaring statement
		
		/*Control flow statement
		 * 1.if,if else,else
		 * 2.for,while,do-while,break,continue
		 * 3.iteration
		 */
		
		
	}
	
	public static boolean doIt() {
		return 4 > 5;
	}

}
