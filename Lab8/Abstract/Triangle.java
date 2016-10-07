import java.lang.Math;

public class Triangle extends Shape {
	
	protected double side1;
	protected double side2;
	protected double side3;

	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getPerimeter() {
		if(isTriangleValid() == true) {
			return (side1 + side2 + side3);
		} else { 
			throw new IllegalArgumentException("Sides entered cannot form a triangle!");
		}

	}

	public double getArea() {
		if(isTriangleValid() == true) {
			double p = getPerimeter() / 2;
			return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		} else {
			throw new IllegalArgumentException("Sides entered cannot form a triangle!");
		}
	}

    public boolean isTriangleValid() {
		if((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
            return true;
        }else {
            return false;
        }
    }

	public String toString() {
		return "A Triangle with side1 = " + getSide1() + " , side2 = " + getSide2() + ", and side3 = " + getSide3() + " , which is a subclass of " + super.toString();
	}
}