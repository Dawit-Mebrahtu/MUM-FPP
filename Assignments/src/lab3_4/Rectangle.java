package lab3_4;

public final class Rectangle implements GeometricShapes {
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}


	@Override
	public double computeArea() {
		return width * length;
	}

}
