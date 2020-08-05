package rep1;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class SimpleProject1 {

	public static void main(String[] args) {
		// 1.add 1 to 100
		int total = 0;
		for(int value = 1;value <= 100; value++ ) {
			System.out.println("Total  is " + total + " and value is " + value);
			total += value;
		}
		System.out.println("Total value is " + total);
		
		//2.add five names to input field and output after final input
		String [] names = new String [5];
		for(int i = 0; i < 5; i++) {
			names[i] = JOptionPane.showInputDialog("Add a name!");
		}
		
		System.out.println(Arrays.toString(names));
		
		int j = 0;
		while(j < names.length) {
			int count = j;
			System.out.println(++count + " person is " + names[j]);
			j++;
		}
		
	}

}
