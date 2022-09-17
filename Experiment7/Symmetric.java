import java.util.Scanner;
import matrix.Matrix;
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
				mat2.setElement(i, j, sc.nextInt());
			}
		}
		System.out.println("The Matrix is " + ((isSymmetric(mat2) ? "Symmetric" : "Not Symmetric")));
	}
}