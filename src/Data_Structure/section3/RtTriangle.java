package Data_Structure.section3;

public class RtTriangle extends Shape{
	int width,height;
	double area;
	RtTriangle(int width,int height){
		this.width = width;
		this.height = height;
	}
	@Override
	double computeArea() {
		area = width * height /2;
		return area;
	}

	@Override
	double computePerimeter() {
		double perimeter = width * 3;
		return perimeter;
	}
	public String toString() {
		return "RtTriangle : width is "+ width + "   theight is "+ height; 
	}

}
