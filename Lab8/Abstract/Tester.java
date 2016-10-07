
public class Tester {

	public static void main(String[] args) {
		
		System.out.println("");
		Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
		System.out.println(s1);                    // which version? in the subclass itself
		System.out.println(s1.getArea());          // which version?in the implemented method in the subclass itself  
		System.out.println(s1.getPerimeter());     // which version? in the implemented method in the subclass itself 
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		//System.out.println(s1.getRadius());      // error! because getRadius() is not implemented in the super class Shape
		System.out.println("");
		   
		Circle c1 = (Circle)s1;                   // Downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());
		System.out.println("");
		   
		//Shape s2 = new Shape(); 			//  error cannot be instatiated since this is an abstract class
		   
		Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		//System.out.println(s3.getLength()); // error! because getLength() is not implemented in super class Shape
		System.out.println("");
		   
		Rectangle r1 = (Rectangle)s3;   // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		System.out.println("");

		Shape s4 = new Square(6.6);     // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		//System.out.println(s4.getSide()); // error! because getSide() is not implemented in super class Shape
		System.out.println("");
		  
		// Take note that we downcast Shape s4 to Rectangle, 
		//  which is a superclass of Square, instead of Square
		Rectangle r2 = (Rectangle)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		//System.out.println(r2.getSide()); // error! because getSide() is not implemented in super class Rectangle
		System.out.println(r2.getLength());
		System.out.println("");

		// Downcast Rectangle r2 to Square
		Square sq1 = (Square)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());
		System.out.println("");

		Triangle tri = new Triangle(6, 5, 5,"RED", true);
		System.out.println(tri);
		System.out.println(tri.isTriangleValid());
		System.out.println(tri.getArea());
		System.out.println(tri.getPerimeter());
		System.out.println(tri.getColor());
		System.out.println("");
	}
}
