package InheritanceTest;

class Shape{
	public double calculateArea(int a,int b) {
		double area=a*b;
		return area;
	}
}

class Circle extends Shape{
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	public double calculateCircleArea() {
		double area=(3.14)*calculateArea(radius,radius);
		return area;
	}
}

class Rectangle extends Shape{
	int length;
	int width;
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public double calculateRectangleArea() {
		double area=calculateArea(length,width);
		return area;
	}
}

class Triangle extends Shape{
	int height;
	int base;
	
	public Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}

	public double calculateTriangleArea() {
		double area=(.5)*calculateArea(height,base);
		return area;
	}
}

public class ShapeHierarchy {

	public static void main(String[] args) {
	
		Circle c=new Circle(5);
		System.out.println("Area of Circle : "+c.calculateCircleArea());
		
		Rectangle r=new Rectangle(4,6);
		System.out.println("Area of Rectangle : "+r.calculateRectangleArea());
		
		Triangle t=new Triangle(3,7);
		System.out.println("Area of Triangle : "+t.calculateTriangleArea());
	}

}
