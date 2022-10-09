class PrintPrimes implements Runnable
{
	Thread t;
	int noOfElements;
	public PrintPrimes(int noOfElements)
	{
		t = new Thread(this, "print primes");
		this.noOfElements = noOfElements;
		t.start();
	}
	public void run()
	{
		int i = 1;
		int num = 2;
		boolean isPrime = true;
		while( i <= noOfElements)
		{
			for(int j = 2; j <= num / 2; j++)
			{
				if( num % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println( "Prime No. " + num + "  ( "+ i +" )");
				i++;
			}
			isPrime = true;
			num++;
		}
	}
}
class PrintFibo implements Runnable
{
	Thread t;
	int noOfElements;
	public PrintFibo(int noOfElements)
	{
		t = new Thread(this, "print fibos");
		this.noOfElements = noOfElements;
		t.start();
	}
	public void run()
	{
		int a = 0;
		int b = 1;
		for(int i = 1; i <= noOfElements; i++)
		{
			System.out.println("Fibo term "+ i + ": " + a);
			b = a + b;
			a = b - a;
		}
	}
}

class PrimeAndFibo
{
	public static void main(String args[])
	{
		PrintPrimes prPrimes = new PrintPrimes(20);
		PrintFibo prFibos = new PrintFibo(15);
		try
		{
			prPrimes.t.join();
			prFibos.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}

	}
}