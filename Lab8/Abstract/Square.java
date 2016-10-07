

public class Square extends Rectangle {

	Square() {}

	Square(double side) {
		super(side, side);
	}
	Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public void setSide(double side) {
		setWidth(side);
		setLength(side);
	}
	
	public double getSide() {
		return super.getWidth();
	}

	@Override
	public void setLength(double side) {
		super.setLength(side);
	}

	@Override
	public void setWidth(double side) {
		super.setWidth(side);
	}

	@Override
	public String toString() {
		return "A Square with side = " + super.getLength()+ ", which is a subclass of " + super.toString();
	}
}