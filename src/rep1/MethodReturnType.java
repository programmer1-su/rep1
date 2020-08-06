package rep1;

public class MethodReturnType {

	public static void main(String[] args) {
		System.out.println(returnInteger());
		System.out.println(returnString());
		
		if(returnFlag()) {
			System.out.println("It is True");
		}else {
			System.out.println("It is False");
		}
	}
	
	
	public static int returnInteger() {
		return 10;
	}
	
	public static String returnString() {
		return "String type return!";
	}
	
	public static Boolean returnFlag() {
		return true;
	}
	
}
