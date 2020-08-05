package rep1;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class SimpleProject2 {

	public static void main(String[] args) {
		// 3.add 10 values to array from input and output total
		int [] numbers = new int[10];
		for(int i = 0; i < 10; i ++) {
			String number = JOptionPane.showInputDialog("Add any numbers!");//JOptionPane only accept String data type
			numbers[i]= Integer.parseInt(number);//change string to integer
		}
		System.out.println(Arrays.toString(numbers));
		
		int total = 0;
		for(int num = 0; num < numbers.length; num++) {
			total += numbers[num];
		}
		
		System.out.println("Total value is " + total);
		
		//4.output a to z
//		char c = 'z';
//		System.out.println((int)c);
		for(int i = 97;i <= 122; i++) {
			System.out.println((char)i);
		}
		
	}

}
