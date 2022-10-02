import java.util.Scanner;
class Experiment12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int sum = 100;
		int numberOffItems;
		int avg = 0;
		System.out.println("Enter the Number of items: ");
		numberOffItems = sc.nextInt();
		try
		{
			avg = sum / numberOffItems;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dividing by zero isn't possible");
		}
		finally
		{
			System.out.println("The number of items entered was: " + numberOffItems);
		}
	}
}