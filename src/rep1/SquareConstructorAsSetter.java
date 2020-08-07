package rep1;

public class SquareConstructorAsSetter {
	private int width,height,area;
	
	public SquareConstructorAsSetter(int width,int height,int area) {//instead three setter methods can use Constructor
		this.width = width;
		this.height = height;
		this.area = area;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getArea() {
		return area;
	}
	
	
}
