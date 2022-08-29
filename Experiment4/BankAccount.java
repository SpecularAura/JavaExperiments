import java.util.Scanner;
class BankAccount
{
	String name;
	String accNumber;
	String type;
	int balance;
	void createAccount(String name, String accNumber, String type)
	{
		this.name = name;
		this.accNumber = accNumber;
		this.type = type;
		this.balance = 0;
	}
	void deposit(int value)
	{
		balance = balance + value;
	}
	void withdraw(int value)
	{
		if(value > balance)
		{
			System.out.println("Cannot Withdraw more than the balance");
		}
		else
		{
			balance = balance - value;
		}
	}
	void accDetails()
	{
		System.out.println("This account belongs to: " + name);
		System.out.println("The balance remaining is: " + balance);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BankAccount acc1 = new BankAccount();
		System.out.println("Enter the name of the account: ");
		String name = sc.nextLine();
		//sc.nextInt();
		System.out.println("Enter the account Number, and account type: ");
		acc1.createAccount(name, sc.next(), sc.next());
		
	}
}
