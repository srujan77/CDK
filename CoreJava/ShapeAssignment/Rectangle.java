package Day2;

public class Rectangle extends Shape1 implements Calculation {
	
	private double length,breadth;
	
	public Rectangle() {
		super("Rectangle");
		length=0;
		breadth=0;
	}
	
	public Rectangle(double length, double breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double area() {
		
		return length*breadth;
	}

	@Override
	public double perimeter() {
		return (2*(length+breadth));
	}


	

}
