class Shape2D
{
	int dimensions[];
	int noOfDimensions;
	Shape2D(int noOfDimensions)
	{
		System.out.println("Shape Constructor is called");
		this.noOfDimensions = noOfDimensions;
		dimensions = new int[noOfDimensions];
	}
}
class Polygon extends Shape2D
{
	Polygon(int noOfEdges)
	{
		super(noOfEdges);
		System.out.println("Polygon Constructor is called");
	}
}
class Rectangle extends Polygon
{
	Rectangle()
	{
		super(4);
		System.out.println("Rectangle Contructor is called");
	}
}
class MultiLevelInheritance
{
	public static void main(String args[])
	{
		Shape2D shape  = new Shape2D(4);
		System.out.print('\n');
		Polygon poly   = new Polygon(4);
		System.out.print('\n');
		Rectangle rect = new Rectangle();
	}
}