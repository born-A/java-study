package prob6;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	public RectTriangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	public double getArea() {
		return width * height / 2;
	}

	public double getPerimeter() { 
		double hypo = Math.sqrt(width * width + height * height);

        return width + height + hypo;
	}

}