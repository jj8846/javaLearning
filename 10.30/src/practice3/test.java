package practice3;

public class test 
{
		public static void main(String[] args) 
		{
				Customer jane=new Customer("Jane", "Smith");
				jane.setAccont(new Account(1000,2000,0.0123));
				jane.getAccount().deposit(100);
				jane.getAccount().withdraw(960);
				jane.getAccount().withdraw(2000);
				
				System.out.println("客户"+jane.getFirstName()+jane.getLastName()+"有一个账户:id是:"+jane.getAccount().getId()+"，年利率是:"+jane.getAccount().getAnnualInterestRate()*100+"%\n余额是:"+jane.getAccount().getBalance());
		}
}
