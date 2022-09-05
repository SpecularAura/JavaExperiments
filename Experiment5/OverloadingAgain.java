import java.util.Scanner;
import java.lang.String;
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
		double s = (dimension1 + dimension2 + dimension3) / 3;
		return Math.sqrt(s * (s - dimension1) * (s - dimension2) * (s - dimension3));
	}
	double area(double dimension1)
	{
		double area;
		switch(shape)
		{
			case "circle":
				area = Math.PI * dimension1 * dimension1;
			case "square":
				area = dimension1 * dimension1;
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