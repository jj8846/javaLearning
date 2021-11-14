package practice4;

public class Account 
{
		private double balance;
		public Account(double init_balance)
		{
			this.balance=init_balance;
		}
		public double getBalance()
		{
			return this.balance;
		}
		public void deposit(double amount)
		{
			System.out.println("存入成功");
			this.balance=this.balance+amount;
		}
		public void withdraw(double amount)
		{
			if(amount>this.balance)
			{
				System.out.println("您的余额不足，取出失败");
			}
			else
			{
				System.out.println("成功取出:"+amount);
				this.balance=this.balance-amount;
			}
		}
}
