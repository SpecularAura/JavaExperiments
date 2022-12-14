---
 - \usepackage{fontspec}
 - \usepackage{fvextra}
 - \setmainfont{Times New Roman}
 - \setmonofont{Consolas}
 - \fvset{breaklines=true, breakanywhere=true}
 - \renewcommand{\theFancyVerbLine}{\textcolor[rgb]{0.0,0.0,0.0}{\arabic{FancyVerbLine}}}
 - \DefineVerbatimEnvironment{Highlighting}{Verbatim}{commandchars=\\\{\}, frame=leftline, numbersep=4pt, framesep=4pt}
 ---
Experiment4:
===============

**Code:**
```{.Java .numberLines}
import java.util.Scanner;
/* The Account class containing the following:
Data:
          name of the depositor - name
          account number - accNumber
          type of account - accType
          balance amount in the account - balance
Methods:
          1.to assign initial values - createAccount
          2.to deposit an amount - deposit
          3.to withdraw an amount after checking balance - withdraw
          4.to display the name & balance - accDetails*/
class Account
{
	String name;
	String accNumber;
	String accType;
	int balance;
	void createAccount(String name, String accNumber, String accType)
	{
		this.name = name;
		this.accNumber = accNumber;
		this.accType = accType;
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
			System.out.println("Insufficient balance");
		}
		else
		{
			balance = balance - value;
		}
	}
	void accDetails()
	{
		System.out.println("Account Holder: " + name);
		System.out.println("Balance: " + balance);
	}
}
// Demonstrating the Account Class
class BankAccount
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Account acc1 = new Account();
		int choice, amount;
		boolean exit = false;
		while(!exit)
		{
			System.out.print("Select an option:\n1. Create an account\n2. Deposit\n3. Withdraw\n4. Account Details\n5. Exit\n  -->");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					sc.nextLine();
					System.out.print("Enter the account holder's name: ");
					String name = sc.nextLine();
					System.out.print("Enter the account number: ");
					String accNumber = sc.next();
					System.out.print("Enter the account type: ");
					String type = sc.next();
					acc1.createAccount(name, accNumber, type);
					break;
				case 2:
					System.out.print("Enter the amount to deposit: ");
					amount = sc.nextInt();
					acc1.deposit(amount);
					break;
				case 3:
					System.out.print("Enter the amount to withdraw: ");
					amount = sc.nextInt();
					acc1.withdraw(amount);
					break;
				case 4:
					acc1.accDetails();
					break;
				case 5:
					exit = true;
					break;
				default:
					System.out.println("Enter a valid option");
			}
		}		
	}
}
```

**Output:** 
```
Select an option:
1. Create an account
2. Deposit
3. Withdraw
4. Account Details
5. Exit
  -->1
Enter the account holder's name: Aum Kulkarni
Enter the account number: 856829612
Enter the account type: Savings
Select an option:
1. Create an account
2. Deposit
3. Withdraw
4. Account Details
5. Exit
  -->2
Enter the amount to deposit: 1300
Select an option:
1. Create an account
2. Deposit
3. Withdraw
4. Account Details
5. Exit
  -->3
Enter the amount to withdraw: 1400
Insufficient balance
Select an option:
1. Create an account
2. Deposit
3. Withdraw
4. Account Details
5. Exit
  -->3
Enter the amount to withdraw: 1200
Select an option:
1. Create an account
2. Deposit
3. Withdraw
4. Account Details
5. Exit
  -->4
Account Holder: Aum Kulkarni
Balance: 100
Select an option:
1. Create an account
2. Deposit
3. Withdraw
4. Account Details
5. Exit
  -->5
```