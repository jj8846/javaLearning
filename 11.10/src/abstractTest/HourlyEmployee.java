package abstractTest;

public class HourlyEmployee extends Employee
{
		public HourlyEmployee(String name, int number, MyDate birthday,int wage,int hours) 
		{
			super(name, number, birthday);
			this.wage=wage;
			this.hour=hour;
		}
		private int wage;
		private int hour;
		public int earnings()
		{
			return wage*hour*30;
		}
		public String toString()
		{
			return ("时薪员工"+"名字:"+getName()+"工号是:"+getNumber()+"生日是:"+getBirthday().toDateString());
		}
}
