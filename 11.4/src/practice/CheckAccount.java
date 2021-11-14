package practice;

import java.nio.charset.CharsetEncoder;

public class CheckAccount extends Account
{
		private double overdraft;
	
		public double getOverdraft() 
		{
			return overdraft;
		}

		public void setOverdraft(double overdraft) 
		{
			this.overdraft = overdraft;
		}

		public CheckAccount(int id, double balance, double annualInterestRate,int overdraft)
		{
			super(id, balance, annualInterestRate);
			this.overdraft=overdraft;
		}
		
		public void withdraw (double amount)
		{
			if(amount<=getBalance())
			{
				System.out.println("取款成功!");
				setBalance(getBalance()-amount);
			}
			else
			{
				//判断是否可以透支
				if(amount<=getBalance()+getOverdraft())
				{
		
					setOverdraft(this.overdraft-(amount-getBalance()));
					setBalance(0);
				}
				else
				{
					System.out.println("透支余额不足");
				}
			}
		}
}

