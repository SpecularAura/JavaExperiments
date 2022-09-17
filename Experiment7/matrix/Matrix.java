package matrix;
import java.util.Scanner;
public class Matrix
{
	int arr[][];
	int rows, columns;
	public Matrix(int rows, int columns)
	{
		arr = new int[rows][columns];
		this.rows = rows;
		this.columns = columns;
	}
	public Matrix()
	{
		arr = new int[2][2];
		rows = 2;
		columns = 2;
	}
	public int elementAt(int row, int column)
	{
		return arr[row][column];
	}
	public void setElement(int row, int column, int data)
	{
		arr[row][column] = data;
	}
	public void setMatrix()
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

	public Matrix transpose()
	{
		Matrix matTranspose = new Matrix(rows, columns);
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				matTranspose.setElement(i, j, this.elementAt(j, i));
			}
		}
		return matTranspose;
	}

	public boolean equals(Matrix mat)
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

	public int getColumns()
	{
		return columns;
	}

	public int getRows()
	{
		return rows;
	}
}