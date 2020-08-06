package rep1;

public class Main {

	public static void main(String[] args) {
		Square sq = new Square();
		sq.width = 100;
		sq.height = 50;
		int area = sq.width * sq.height;
		
		Circle c = new Circle();
		c.radius = 10;
		
		System.out.println(area);
		System.out.println(c.radius);
		System.out.println(sq.task());
		
		
	}

}
