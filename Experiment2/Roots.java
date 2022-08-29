// a. WAP to print the roots of quadratic equation
import java.util.Scanner;
class Roots{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coefficients of the quadratic equation");
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int D = (b*b - 4*a*c);
		double rootD = Math.sqrt(D);
		boolean is0 = (D == 0);
		System.out.println(( is0 ? ("The root is " + -b / (2*a)) : ("The roots are: " + ((-b + rootD) / (2*a)) + "and "+((-b - rootD) / (2*a)) )));
	}
}