import java.util.Scanner;
import matrix.Matrix;
class Multiplication
{
	static Matrix multiply(Matrix mat1, Matrix mat2)
	{
		if(mat1.getColumns() != mat2.getRows())
		{
			System.out.println("Cannot Multiply these matrices");
		}
		Matrix matMult = new Matrix(mat1.getRows(), mat2.getColumns());
		for(int i=0; i < mat1.getRows(); i++)
		{
			for(int j=0; j < mat1.getColumns(); j++)
			{
				for(int k = 0; k < mat1.getColumns(); k++)
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
		System.out.print(multiply(mat1, mat2));
	}
}