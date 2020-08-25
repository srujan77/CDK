package Day2;

public class TestShape1 {
	
	public static void main(String args[])
	{
		Rectangle rectangle= new Rectangle(4,5);
		Circle1 circle = new Circle1(3);
		Square square = new Square(5);
		System.out.println("Area of square : "+square.area()+" perimeter of square : "+square.perimeter());
		System.out.println("Area of Rectangle : "+rectangle.area()+" perimeter of rectangle : "+rectangle.perimeter());
		System.out.println("Area of circle : "+circle.area()+" perimeter of circle : "+circle.perimeter());
	}

}
