
public abstract class Shape {
	
	protected String color;
	protected boolean filled;

	Shape() {
		color = "green";
		filled = true;
	}

	Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public boolean isFilled() {
		return filled;
	}

	public abstract double getArea();
	public abstract double getPerimeter();

	public String toString() {
		if(isFilled() == true)
			return "A Shape with color of " + getColor() + " and is filled.";
		else
			return "A Shape with color of " + getColor() + " and is not filled."; 
	}

}
