class PrintTables extends Thread
{
	int num;
	public PrintTables(int num)
	{
		super("Table" + num);
		this.num = num;
	}
	public void run()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(num + "*"+ i + ": " + num * i);
		}
	}
}
class Tables
{
	public static void main(String args[])
	{
		PrintTables  t5 = new PrintTables(5);
		PrintTables  t7 = new PrintTables(7);
		PrintTables  t13 = new PrintTables(13);

		t5.start();
		t7.start();
		t13.start();

		try
		{
			t5.join();
			t7.join();
			t13.join();			
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}