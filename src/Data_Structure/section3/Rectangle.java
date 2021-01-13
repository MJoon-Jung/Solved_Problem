package Data_Structure.section3;

public class Rectangle extends Shape{
	int width,height;
	double area;
	public Rectangle(int width,int height){
		this.width = width;
		this.height = height;
	}
	@Override
	double computeArea() {
		area = width * height;
		return area;
	}

	@Override
	double computePerimeter() {
		double Perimeter = (width + height) * 2;
		return Perimeter;
	}
	public String toString() {
		return "Rectangle : width is "+width + "   height is "+ height;
	}

}
