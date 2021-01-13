package Data_Structure.section3;

public class Circle extends Shape{
	int radius;
	double area;
	public Circle(int radius) {
		this.radius = radius;
	}
	@Override
	double computeArea() {
		area = Math.pow(radius, 2.0) * Math.PI;
		return area;
	}
	@Override
	double computePerimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	public String toString() {
		return "Circle : radius is "+ radius;
	}
}
