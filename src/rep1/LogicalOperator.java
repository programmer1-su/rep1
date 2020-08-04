package rep1;

public class LogicalOperator {

	public static void main(String[] args) {
		
		int age = 20;
		int permit = 18;
		
		boolean answer = age == 20 && permit < age;// && Operator
		System.out.println("Answer is " + answer);
		
		boolean answer1 = age == 18 || permit < age;// || Operator
		System.out.println("Answer is " + answer1);
		
		boolean bol = true;
		bol = !bol;// ! Operator
		System.out.println("Answer is " + bol);
		
		
	}

}
