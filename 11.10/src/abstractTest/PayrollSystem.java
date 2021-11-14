package abstractTest;

import java.util.Scanner;

public class PayrollSystem 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int month=scanner.nextInt();
		Employee[] emoployees=new Employee[]{new SalariedEmployee("jerry", 1000, new MyDate(2000, 1, 1), 10000)
										,new HourlyEmployee("jenne", 1001, new MyDate(2000, 5, 12), 20,5)};
		for(int i=0;i<emoployees.length;i++)
		{
			System.out.println(emoployees[i].toString());
			if(emoployees[i].getBirthday().getMonth()==month)
				System.out.println("该月工资为:"+(emoployees[i].earnings()+100));
		}
	
		}
}
