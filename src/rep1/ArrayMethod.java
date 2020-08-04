package rep1;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		
		String[] men = {"Ironman","Batman","Spiderman","Superman","Gentleman"};
		System.out.println(men.length);//find array of length
		
//		String arrayToString = Arrays.toString(men);
//		System.out.println(arrayToString);
		System.out.println(Arrays.toString(men));//change array to string
		
		String [] cars = {"Alphabert","Swift","Toyota"};
		boolean b = Arrays.asList(cars).contains("Swift");
		System.out.println(b);//check desire car name contain or not contain
		
		int [] numbers = {10,20,30,40,50,60,70};
		int [] copyArray = new int [4];
		System.arraycopy(numbers, 3, copyArray, 1, 3);//array copy with five parameters 
		System.out.println(Arrays.toString(copyArray));
		
		String[] originAry = {"One","Two","Three","Four","Five"};
		String[] copyAry = Arrays.copyOfRange(originAry, 2, 4);//array copy with three parameters 
		String[] copyAry1 = Arrays.copyOfRange(originAry, 2, 5);
		System.out.println(Arrays.toString(copyAry));
		System.out.println(Arrays.toString(copyAry1));
	}

}
