import java.util.Scanner;
import static java.lang.Math.*;
class Shape
{
	String shape;
	Shape()
	{
		shape = null;
	}
	Shape(String shape)
	{
		this.shape = shape.toLowerCase();
	}
	double area(double dimension1, double dimension2, double dimension3)
	{
		double s = (dimension1 + dimension2 + dimension3) / 2;
		double area = sqrt(s * (s - dimension1) * (s - dimension2) * (s - dimension3));
		return area;
	}
	double area(double dimension1)
	{
		double area;
		switch(shape)
		{
			case "circle":
				area = PI * dimension1 * dimension1;
				break;
			case "square":
				area = dimension1 * dimension1;
				break;
			default:
				area = 0;
		}
		return area;
	}
	double area(double dimension1, double dimension2)
	{
		return dimension1 * dimension2;
	}
}
class Overloading
{
	public static void main(String args[])
	{
		Shape shape1 = new Shape("triangle");
		Shape shape2 = new Shape("square");
		Shape shape3 = new Shape
		System.out.println(shape1.area(10, 11, 10));
		System.out.println(shape2.area(10));
	}
}