package pratice1;

public class ManKind 
{
		private int sex=1;
		private int salary=300000;
		void manOrWoman()
		{
			if(sex==1)
			{
				System.out.println("man");
			}
			else
			{
				System.out.println("woman");
			}
		}
		void employeed()
		{
			if(salary == 0)
				System.out.println("no job");
			else
				System.out.println(salary);
		}
		public int getSex() {
			return sex;
		}
		public void setSex(int sex) {
			this.sex = sex;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
}
