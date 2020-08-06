package rep1;

public class MethodWithParameters {

	public static void main(String[] args) {
		one(1122);//one 引数
		two(10,20);
	}
	
	public static void one(int num) {//one パラメータ
		System.out.println("Number is " + num);
	}
	
	public static void two(int num,int num2) {
		System.out.println("Numbers are " + num + " and " + num2);
	}

}
