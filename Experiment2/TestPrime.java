import java.util.Scanner;
class TestPrime{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num, i;
		System.out.println("Enter a number");
		num = sc.nextInt();
		for( i = 2; i <= num / 2; i++)
		{
			if(num % i == 0)
			{
				System.out.println("The Number is not prime");
				break;
			}
		}
        if(i == num / 2 + 1)
        {
            System.out.println("The number is prime");
        }
        sc.close();
	}
}