package Day2;

public class Circle1 extends Shape1 implements Calculation {
	
	private int radius;

	public Circle1() {
		super("Circle");
		radius=1;
	}

	public Circle1(int radius) {
		super("Circle");
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		return 3.141*radius*radius;
	}

	@Override
	public double perimeter() {
		return 2*3.141*radius;
	}

}
