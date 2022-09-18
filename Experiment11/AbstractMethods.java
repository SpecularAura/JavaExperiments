import java.util.Scanner;
import static java.lang.Math.*;
abstract class Shape
{
	public abstract double area();
	public String toString()
	{
		Double result = Double.valueOf(area());
		String res = result.toString();
		return res;
	}
}
class Rectangle extends Shape
{
	double length, breadth;
	public Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public double area()
	{
		return length * breadth;
	}
}
class Triangle extends Shape
{
	double side1, side2, side3;
	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double area()
	{
		double s = (side1 + side2 + side3) / 2;
		return sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}
class Circle extends Shape
{
	double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public double area()
	{
		return PI * radius * radius;
	}
}
class AbstracMethods
{
	public static void main(String args[])
	{
		Shape[] shapes = new Shape[3];
		shapes[0] = new Triangle(10, 15, 20);
		shapes[1] = new Rectangle(10, 20);
		shapes[2] = new Circle(10);
		for(int i = 0; i < 3; i++)
		{
			System.out.println(shapes[i]);
		}
	}
}