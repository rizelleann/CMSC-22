import java.lang.Math;
public class Circle extends Shape { 

	protected double radius;

	public Circle() {
		radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() { //(PI)r(squared)
		return radius * radius * Math.PI;
	}

	public double getPerimeter() { //2(PI)r
		return 2 * radius * Math.PI;
	}

	public String toString() {
		return "A Circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
	}

}