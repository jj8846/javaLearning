package abstractTest;

public class SalariedEmployee extends Employee
{
		public SalariedEmployee(String name, int number, MyDate birthday,int monthlySalary) 
		{
			super(name, number, birthday);
			this.monthlySalary=monthlySalary;
		}
		private int monthlySalary;
		public int earnings()
		{
			return monthlySalary;
		}
		public String toString()
		{
			return 	("月薪员工"+"名字:"+getName()+"工号是:"+getNumber()+"生日是:"+getBirthday().toDateString());

		}
}


