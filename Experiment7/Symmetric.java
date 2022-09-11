import java.util.Scanner;
class Matrix
{
	int arr[][];
	int rows, columns;
	Matrix(int rows, int columns)
	{
		arr = new int[rows][columns];
		this.rows = rows;
		this.columns = columns;
	}
	Matrix()
	{
		arr = new int[2][2];
		rows = 2;
		columns = 2;
	}
	int elementAt(int row, int column)
	{
		return arr[row][column];
	}
	void elementSet(int row, int column, int data)
	{
		arr[row][column] = data;
	}
	Matrix transpose()
	{
		Matrix matTranspose = new Matrix(rows, columns);
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				matTranspose.elementSet(i, j, this.elementAt(j, i));
			}
		}
		return matTranspose;
	}
	boolean equals(Matrix mat)
	{
		if( rows != mat.columns || columns != mat.columns)
		{
			System.out.print("Cannot Compare these matrices");
		}
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				if(this.elementAt(i, j) != mat.elementAt(i, j))
				{
					return false;
				}
			}
		}
		return true;
	}
}
class Symmetric
{
	static boolean isSymmetric(Matrix mat)
	{
		return mat.equals(mat.transpose());
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the order of the Matrix: ");
		int order = sc.nextInt();
		Matrix mat2 = new Matrix(order, order);
		for(int i = 0; i < order; i++)
		{
			for(int j = 0; j < order; j++)
			{
				System.out.print("mat[" + i +"]" + "[" + j + "]: ");
				mat2.elementSet(i, j, sc.nextInt());
			}
		}
		System.out.println("The Matrix is " + ((isSymmetric(mat2) ? "Symmetric" : "Not Symmetric")));
	}
}