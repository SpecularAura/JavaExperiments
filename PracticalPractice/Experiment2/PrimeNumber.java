import java.util.Scanner;
class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int i;
		boolean isPrime = true;
		for(i = 2; i <= Math.sqrt(num); i++)
		{
			if(num % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("The Number is prime");
		}
		else
		{
			System.out.println("The Number is not prime");
		}
	}
}