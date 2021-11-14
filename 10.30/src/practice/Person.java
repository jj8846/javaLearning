package practice;

public class Person 
{
	private int age;
	public void setage(int n)
	{
		if(n>=0 && n<130)
		{
			age=n;
		}
		else
		{
			System.out.println("输入有误");
		}
	}
	public int getage()
	{
		return age;
	}
	public Person()
	{
		age=18;
	}
}
