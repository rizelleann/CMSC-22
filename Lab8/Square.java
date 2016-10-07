
public class Square extends Rectangle {

	Square() {}

	Square(double side) {
		super(side, side);
	}

	Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public void setSide(double side) {
		setLength(side);
		setWidth(side);
	}
	public double getSide() {
		return getWidth();
	}

	public void setLength(double side) {
		super.setLength(side);
	}

	public void setWidth(double side) {
		super.setWidth(side);
	}

	public String toString() {
		return "A Square with side = " + super.getLength()+ ", which is a subclass of " + super.toString();
		
	}
}