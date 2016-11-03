
public class Tester1 {

	public static void main(String[] args) {

		Shape sh = new Shape();
		System.out.println(sh);
		System.out.println("");

		Shape sh1 = new Shape("red", true);
		System.out.println(sh1);
		System.out.println(sh1.getColor());
		System.out.println(sh1.isFilled());
		System.out.println("");

		Shape c1 = new Circle();
		System.out.println(c1);
		System.out.println("");

		Shape c2 = new Circle(2.0);
		System.out.println(c2);
		System.out.println("");

		Shape c3 = new Circle(3.0, "green", false);
		System.out.println(c3);
		System.out.println("Color = " + c3.getColor());
		System.out.println("Filled = " + c3.isFilled());
		System.out.println("");

		Circle c4 = new Circle(4.0, "green", false);
		System.out.println(c4);
		System.out.println("Filled = " + c4.isFilled());
		System.out.println("Color = " + c4.getColor());
		System.out.println("Radius = " + c4.getRadius());
		System.out.println("Area = " + c4.getArea());
		System.out.println("Perimeter = " + c4.getPerimeter());
		System.out.println("");

		Shape rec1 = new Rectangle();
		System.out.println(rec1);
		System.out.println("");

		Shape rec2 = new Rectangle(4.0, 5.0);
		System.out.println(rec2);
		System.out.println("");

		Rectangle rec3 = new Rectangle(5.0, 6.0, "yellow", true);
		System.out.println(rec3);
		System.out.println("Filled = " + rec3.isFilled());
		System.out.println("Color = " + rec3.getColor());
		System.out.println("Length = " + rec3.getLength());
		System.out.println("Width = " + rec3.getWidth());
		System.out.println("Area = " + rec3.getArea());
		System.out.println("Perimeter = " + rec3.getPerimeter());
		System.out.println("");

		Shape sqr1 = new Square(6.0);
		System.out.println(sqr1);
		System.out.println("");

		Shape sqr2 = new Square(6.0, "blue", false);
		System.out.println(sqr2);
		System.out.println("Color = " + sqr2.getColor());
		System.out.println("Filled = " + sqr2.isFilled());
		System.out.println("");

		Square sqr3 = new Square(6.0, "blue", false);
		System.out.println(sqr3);
		System.out.println("Filled = " + sqr3.isFilled());
		System.out.println("Color = " + sqr3.getColor());
		System.out.println("Length = " + sqr3.getLength());
		System.out.println("Width = " + sqr3.getWidth());
		System.out.println("Side = " + sqr3.getSide());
		System.out.println("Area = " + sqr3.getArea());
		System.out.println("Perimeter = " + sqr3.getPerimeter());

	}	
	
}
