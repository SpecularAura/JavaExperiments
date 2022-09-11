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
	void setElement(int row, int column, int data)
	{
		arr[row][column] = data;
	}
	void setMatrix()
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				System.out.print("mat[" + i +"]" + "[" + j + "]: ");
				this.setElement(i, j, sc.nextInt());
			}
		}
	}
	public String toString()
	{
		StringBuilder str = new StringBuilder();
		for(int i=0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				str.append(this.elementAt(i, j));
				str.append(' ');
			}
			str.append('\n');
		}
		return str.toString();
	}
}
class Multiplication
{
	static Matrix multiply(Matrix mat1, Matrix mat2)
	{
		if(mat1.columns != mat2.rows)
		{
			System.out.println("Cannot Multiply these matrices");
		}
		Matrix matMult = new Matrix(mat1.rows, mat2.columns);
		for(int i=0; i < mat1.rows; i++)
		{
			for(int j=0; j < mat1.columns; j++)
			{
				for(int k = 0; k < mat1.columns; k++)
				{
					matMult.setElement(i, j, matMult.elementAt(i, j) + mat1.elementAt(i, k) * mat2.elementAt(k, j));
				}
			}
		}
		return matMult;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of rows of Matrix1: ");
		int rows = sc.nextInt();
		System.out.print("Enter the no of columns of Matrix1: ");
		int columns = sc.nextInt();
		Matrix mat1 = new Matrix(rows, columns);
		mat1.setMatrix();
		System.out.print("Enter the no of rows of Matrix2: ");
		rows = sc.nextInt();
		System.out.print("Enter the no of columns of Matrix2: ");
		columns = sc.nextInt();
		Matrix mat2 = new Matrix(rows, columns);
		mat2.setMatrix();
		System.out.println(multiply(mat1, mat2));
	}
}