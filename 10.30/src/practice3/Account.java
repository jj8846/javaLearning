package practice3;

public class Account 
{
	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Account(int id, double balance, double annualInterestRate) 
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//取钱
	public void withdraw(double amount)
	{
		if(amount>this.balance)
			System.out.println("您的余额不足,取款失败");
		else
		{
			  System.out.println("成功取出:"+amount);
			  this.balance=this.balance-amount;
		}
	}
	
	//存钱
	public void deposit(double amount)
	{
		System.out.println("成功存入:"+amount);
		this.balance=this.balance+amount;
	}
	
	

}
