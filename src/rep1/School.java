package rep1;

public class School {
	/*
	 * コンストラクタoverloading means same コンストラクタname but must have different parameters.
	 */
	public School() {//コンストラクタ
		System.out.println("This is school constructor");
	}
	
	public School(String name) {
		System.out.println("The school name is " + name);
	}
}
