import java.util.Scanner;
import static java.lang.Math.*;
class Shape
{
	public String shape;
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
		if(shape.equals("triangle"))
		{
			double s = (dimension1 + dimension2 + dimension3) / 2;
			double area = sqrt(s * (s - dimension1) * (s - dimension2) * (s - dimension3));
			return area;
		}
		System.out.println("Cannot calculate Area for such Shape");
		return 0;
	}
	double area(double dimension1)
	{
		double result; 
		switch(shape)
		{
			case "circle": 
				result = PI * dimension1 * dimension1;
				break;
			case "square": 
				result = dimension1 * dimension1;
				break;
			case "triangle": 
				result = area(dimension1, dimension1, dimension1);
				break;
			case "rectangle": 
				result = area(dimension1, dimension1);
				break;
			default:
				result = 0;
		};
		if(result == 0)
		{
			System.out.println("Cannot calculate the area for such a shape");
		}
		return result;
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
		System.out.println("Area of Triangle with side 10, 11 and 10: " + shape1.area(10, 11, 10));
		System.out.println("Area of Square with side 10: " + shape2.area(10));
		shape2.shape = "circle";
		System.out.println("Area of Circle with side 10: " + shape2.area(10));
		shape2.shape = "triangle";
		System.out.println("Area of Equilateral Triangle with side 10: " +shape2.area(10));
	}
}