package rep1;

public class Method {
	
	public static void main(String[] args) {//static method
		task();
	}
	
	public static void task() {//static method
		Method m = new Method();//static method からnon-static　methodを呼ぶときinstanceオブジェクト作成必要
		m.noTask();
	}
	
	public void noTask() {//non-static method
		end();//non-static　methodからstatic methodを直接呼び出す。
	}
	
	public static void end() {//static method
		System.out.println("End of program!");
	}

}
