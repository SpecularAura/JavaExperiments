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
            return;
        }
        balance = balance - value;
    }
    synchronized public void depositTimes(int value, int times)
    {
        for(int i = 0; i < times; i++)
        {
            deposit(value);
            System.out.println("Balance: " + balance);
        }
    }

    synchronized public void withdrawTimes(int value, int times)
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