package practice;

public class CheckAccountTest
{
		public static void main(String[] args) {
			CheckAccount checkaccount=new CheckAccount(1122, 20000, 0.045, 5000);
			checkaccount.withdraw(5000);
			System.out.println("您的余额为:"+checkaccount.getBalance());
			System.out.println("您的可透余额为:"+checkaccount.getOverdraft());
			System.out.println();
			checkaccount.withdraw(18000);
			System.out.println("您的余额为:"+checkaccount.getBalance());
			System.out.println("您的可透余额为:"+checkaccount.getOverdraft());
			System.out.println();
			checkaccount.withdraw(3000);
			System.out.println("您的余额为:"+checkaccount.getBalance());
			System.out.println("您的可透余额为:"+checkaccount.getOverdraft());
			System.out.println();
			
		}
}
