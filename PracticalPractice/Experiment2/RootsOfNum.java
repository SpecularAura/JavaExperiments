import java.util.Scanner;
import static java.lang.Math.*;
class RootsOfNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose square root is to be found: ");
		double num = sc.nextInt();
		System.out.println("The square root of the number: " + sqrt(num));
	}
}