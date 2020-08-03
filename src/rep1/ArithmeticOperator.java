package rep1;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int girlStudents = 50;
		int boyStudents = 20;
		int total = girlStudents + boyStudents;// + Operator
		System.out.println("Total students is " + total);
		
		int totalStudents = 70;
		int absenceStudents = 9;
		int attendenceStudents = totalStudents - absenceStudents;//- Operator
		System.out.println("Currnet presented students is " + attendenceStudents);
		
		int episode = 20;
		int series = 5;
		int count = episode * series;//* Operator
		System.out.println("Total episode count is " + count);
		
		int people = 12098;
		int car = 150;
		int count_people_in_a_car = people/car;// /Operator
		System.out.println("Each car will hold " + count_people_in_a_car + " people.");
		
		int cake_pieces = 5;
		int children = 2;
		int remain_pieces = cake_pieces % children;// %Operator
		System.out.println("Remain pieces are " + remain_pieces);
		
		int count1 = 10;
		//count1 = count1 + 1;
		count1++;//increment operator
		System.out.println("Total count is " + count1);
		
		int count2 = 5;
		//count2 = count2 - 1;
		count2--;//decrement operator
		System.out.println("Total count is " + count2);
		
		
		
	}

}
