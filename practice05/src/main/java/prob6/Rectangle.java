package prob6;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;
	
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return (width + height) * 2;
	}

	@Override
	public void resize(double argument) {
		width *= argument;
		height *= argument;
	}

}
