
class Shape
{
	double area;

	Shape() {
		super();
		this.area = 0;
		
	}

	Shape(double area) {
		super();
		this.area = area;
	}

	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}
	
	
	void  calculateArea()
	{
		System.out.println("shape area");
	}
	
	void display()
	{
		System.out.println("Area of shape is = " + area);
	}
}//class shape end here

class Triangle extends Shape
{
	double height;
	double base;
	
	Triangle() {
		super();
		this.height = 23;
		this.base = 12;
	}

	

	Triangle(double height, double base) {
		
		this.height = height;
		this.base = base;
	}



	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}

	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}
	
	void calculateArea()
	{
		area=0.5*base*height;
	}
	
	void display()
	{
		System.out.println("Area od Tiangle is "+area);
	}
	
}//class triangle end here


class Rectangle extends Shape
{
	double length;
	double width;
	
	Rectangle() {
		super();
		this.length = 3;
		this.width = 2;
	}

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getWidth() {
		return width;
	}

	void setWidth(double width) {
		this.width = width;
	}
	
	
	void calculateArea()
	{
		area=length*width;
	}
	
 	void display()
	{
		System.out.println("Area od Rectangle is "+area);
	}
}//class rectangle end here

class Circle extends Shape
{
	double radius;

	Circle() {
		super();
		this.radius = 2.5;
	}

	Circle(double radius) {
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
	void calculateArea()
	{
		area=3.14*radius*radius;
	}
	
	void display()
	{
		System.out.println("area of circle is "+area);
	}
}//class circle end here

class ShapeTestPoly
{
	public static void main(String[] args)
	{
		Shape s1=new Shape();
		s1.display();
		Shape s2=new Shape();
		s2.display();
		
		s1=new Triangle(10,5);
		s1.calculateArea();
		s1.display();
		s2=new Triangle();
		s2.calculateArea();
		s2.display();
		
		s1=new Rectangle(12,6);
		s1.calculateArea();
		s1.display();
		s2=new Rectangle();
		s2.calculateArea();
		s2.display();
		
		
		s1=new Circle(6);
		s1.calculateArea();
		s1.display();
		s2=new Circle();
		s2.calculateArea();
		s2.display();
		
	}
}//class shapetest end here 
