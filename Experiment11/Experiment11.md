---
header-includes:
 - \usepackage{fontspec}
 - \usepackage{fvextra}
 - \setmainfont{Times New Roman}
 - \setmonofont{Consolas}
 - \fvset{breaklines=true, breakanywhere=true}
 - \renewcommand{\theFancyVerbLine}{\textcolor[rgb]{0.0,0.0,0.0}{\arabic{FancyVerbLine}}}
 - \DefineVerbatimEnvironment{Highlighting}{Verbatim}{commandchars=\\\{\}, frame=leftline, numbersep=4pt, framesep=4pt}
fontsize: 12pt
geometry: left=3cm,right=3cm,top=2cm,bottom=2cm
---
\huge Name: Aum Kulkarni  \newline
Divison: D6AD  \newline
Roll No 36  \newline
Experiment 11: Program on abstract class and abstract methods  \newline

\normalsize
\newpage
Code: 
```{.Java .numberLines}
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
	public String toString()
	{
		String str = "The area of a Rectangle with length " + length + " and width " + breadth + ": " + area();
		return str;
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
	public String toString()
	{
		String str = "The area of a Triangle with sides " + side1 + " " + side2 + " " + side3 + ": " + area();
		return str;
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
	public String toString()
	{
		String str = "The area of a Circle with radius " + radius + ": " + area();
		return str;
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
```
## Output: 
```
The area of a Triangle with sides 10.0 15.0 20.0: 72.61843774138907
The area of a Rectangle with length 10.0 and width 20.0: 200.0
The area of a Circle with radius 10.0: 314.1592653589793
```
\newpage

If we make Rectangle class final and make a class Square that inherits from it the Java compiler will show an error

```{.Java .numberLines}
final class Rectangle extends Shape
{
	double length, breadth;
	public Rectangle()
	{
		length  = 0.0;
		breadth = 0.0;
	}
	public Rectangle(double length, double breadth)
	{
		this.length  = length;
		this.breadth = breadth;
	}
	public double area()
	{
		return length * breadth;
	}
	public String toString()
	{
		String str = "The area of a Rectangle with length " + length + " and width " + breadth + ": " + area();
		return str;
	}
}
class Square extends Rectangle
{
}
```
```
AbstractMethods.java:36: error: cannot inherit from final Rectangle
class Square extends Rectangle
                     ^
1 error
```