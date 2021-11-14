package practice;

public class Account
{
	private int id;
	private double balance;
	private double annualInterestRate;
	
	
	
	public Account(int id, double balance, double annualInterestRate) 
	{
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) 
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterest()
	{
		return annualInterestRate/12;
	}
	
	public void withdraw (double amount)
	{
		if(amount>balance)
		{
			System.out.println("您的余额不足！");
			return ;
		}
		else
		{
			balance=balance-amount;
			System.out.println("取款成功！");
		}
	}
	public void deposit (double amount)
	{
		setBalance(getBalance()+amount);
		System.out.println("存款成功！");
	}
}
