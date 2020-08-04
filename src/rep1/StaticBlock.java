package rep1;

public class StaticBlock {
	//if static block exist,it first work and then main method works.
	static {
		System.out.println("Working First!");
	}

	public static void main(String[] args) {
		System.out.println("Working Second!");
	}

}
