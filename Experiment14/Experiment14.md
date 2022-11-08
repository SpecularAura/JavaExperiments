---
header-includes:
- \usepackage{fontspec}
- \usepackage{fvextra}
- \setmainfont{Times New Roman}
- \setmonofont{Latin Modern Mono}
- \fvset{breaklines=true, breakanywhere=true}
- \renewcommand{\theFancyVerbLine}{\textcolor[rgb]{0.0,0.0,0.0}{\small\arabic{FancyVerbLine}}}
- \DefineVerbatimEnvironment{Highlighting}{Verbatim}{commandchars=\\\{\}, frame=leftline, numbersep=4pt, framesep=4pt}
fontsize: 12pt
geometry: left=3cm,right=3cm,top=2cm,bottom=2cm
---
\Huge
**Name:** Aum Kulakrni \newline \newline
**Div:** D6AD \newline \newline
**Roll No.** 36 \newline \newline 
**Experiment Title:** \newline       Program on Multithreading \newline
\normalsize
\newpage
\Large WAJP to print the table of 5,7,13 using Multithreading (Use thread class) \normalsize \newline
\Huge Code: \normalsize
```{.Java .numberLines}
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
```
\newpage
\Huge Ouput: \normalsize
```
5*1: 5
5*2: 10
13*1: 13
7*1: 7
13*2: 26
5*3: 15
5*4: 20
13*3: 39
13*4: 52
7*2: 14
13*5: 65
13*6: 78
13*7: 91
13*8: 104
13*9: 117
5*5: 25
13*10: 130
7*3: 21
5*6: 30
5*7: 35
7*4: 28
5*8: 40
5*9: 45
7*5: 35
7*6: 42
5*10: 50
7*7: 49
7*8: 56
7*9: 63
7*10: 70
```
\newpage
\Large WAJP to print first 20 prime nos. and 15 Fibonacci terms. (Using Runnable Interface)	 \normalsize \newline
\Huge Code: \normalsize
```{.Java .numberLines}
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
```
\newpage
\Huge Ouput: \normalsize
```
Prime No. 2  ( 1 )
Prime No. 3  ( 2 )
Prime No. 5  ( 3 )
Prime No. 7  ( 4 )
Prime No. 11  ( 5 )
Prime No. 13  ( 6 )
Prime No. 17  ( 7 )
Prime No. 19  ( 8 )
Prime No. 23  ( 9 )
Fibo term 1: 0
Prime No. 29  ( 10 )
Prime No. 31  ( 11 )
Prime No. 37  ( 12 )
Prime No. 41  ( 13 )
Fibo term 2: 1
Prime No. 43  ( 14 )
Prime No. 47  ( 15 )
Fibo term 3: 1
Fibo term 4: 2
Fibo term 5: 3
Prime No. 53  ( 16 )
Prime No. 59  ( 17 )
Fibo term 6: 5
Prime No. 61  ( 18 )
Prime No. 67  ( 19 )
Fibo term 7: 8
Fibo term 8: 13
Prime No. 71  ( 20 )
Fibo term 9: 21
Fibo term 10: 34
Fibo term 11: 55
Fibo term 12: 89
Fibo term 13: 144
Fibo term 14: 233
Fibo term 15: 377
```
\newpage
\Large Program on concept of synchronization	 \normalsize \newline
\Huge Code: \normalsize
```{.Java .numberLines}
class Account
{
    int balance;
    public Account(int balance)
    {
        this.balance = balance;
    }
    public void deposit(int value)
    {
        balance = balance + value;
    }
    public void withdraw(int value)
    {
        if(balance - value < 0)
        {
            System.out.println("Cannot Withdraw");
        }
        else
        {
            balance = balance - value;
        }
    }
    public void depositTimes(int value, int times)
    {
        for(int i = 0; i < times; i++)
        {
            deposit(value);
            System.out.println("Balance: " + balance);
        }
    }

    public void withdrawTimes(int value, int times)
    {
        for(int i = 0; i < times; i++)
        {
            withdraw(value);
            System.out.println("Balance: " + balance);
        }
    }
}
class ATM implements Runnable
{
    Account ac;
    Thread t;
    public ATM(Account ac)
    {
        t = new Thread(this, "ATM");
        this.ac = ac;
    }
    public void run()
    {
        ac.withdrawTimes(500, 10);
    }
}
class Bank implements Runnable
{
    Account ac;
    Thread t;
    public Bank(Account ac)
    {
        t = new Thread(this, "Bank");
        this.ac = ac;
    }
    public void run()
    {
        ac.depositTimes(500, 10);
    }
}
class SynchronizationIssue
{
    public static void main(String args[])
    {
        Account ac = new Account(500);
        Bank bank = new Bank(ac);
        ATM atm = new ATM(ac);
        bank.t.start();
        atm.t.start();
        try
        {
            bank.t.join();
            atm.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
```
\Huge Ouput: \normalsize
```
Balance: 500
Balance: 0
Cannot Withdraw
Balance: 0
Cannot Withdraw
Balance: 0
Cannot Withdraw
Balance: 500
Balance: 0
Balance: 500
Balance: 0
Balance: 0
Cannot Withdraw
Balance: 500
Balance: 500
Balance: 1000
Balance: 0
Balance: 1500
Balance: 1000
Balance: 1500
Balance: 1000
Balance: 1500
Balance: 2000
Balance: 2500
```
\large If we make the functions operating on the shared data synchronized then only one thread will be able to access it at once
Thus all the withdraws will occur after all the deposits \normalsize \newpage
\Huge Code: \normalsize
```{.Java .numberLines}
class Account
{
    int balance;
    public Account(int balance)
    {
        this.balance = balance;
    }
    synchronized public void deposit(int value)
    {
        balance = balance + value;
    }
    synchronized public void withdraw(int value)
    {
        if(balance - value < 0)
        {
            System.out.println("Cannot Withdraw");
        }
        balance = balance - value;
    }
}
```

\Huge Ouput: \normalsize
```
Balance: 1000
Balance: 1500
Balance: 2000
Balance: 2500
Balance: 3000
Balance: 3500
Balance: 4000
Balance: 4500
Balance: 5000
Balance: 5500
Balance: 5000
Balance: 4500
Balance: 4000
Balance: 3500
Balance: 3000
Balance: 2500
Balance: 2000
Balance: 1500
Balance: 1000
Balance: 500
```