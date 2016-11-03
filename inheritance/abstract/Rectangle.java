

public class Rectangle extends Shape {
	protected double width;
	protected double length;

	Rectangle() {
		width = 1.0;
		length = 1.0;
	}

	Rectangle(double width,  double length) {
		this.width = width;
		this.length = length;
	}

	Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	} 

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getPerimeter() {
		return (2 * length) + (2 * width);
	}

	@Override
	public String toString() {
		return "A Rectangle with width = "+ getWidth() + " and length = " + getLength() + ", which is a subclass of " + super.toString();
	}
}