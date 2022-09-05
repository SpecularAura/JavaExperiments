import java.util.Scanner;
class Shape
{
	int dimension1, dimension2, dimension3;
	String shape;
	Shape()
	{
		dimension1 = 0;
		dimension2 = 0;
		dimension3 = 0;
		shape = null;
	}
	Shape(int dimension1, int dimension2, int dimension3)
	{
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
		this.dimension3 = dimension3;
	}
	Shape(int dimension1, int dimension2, String shape)
	{
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
		this.shape = 
	}
	Shape(int dimension1, int dimension2)
	{
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
	}
	Shape(int dimension1, String shape)
	{
		this.dimension1 = dimension1;
		this.shape = shape.toLower();
	}

}