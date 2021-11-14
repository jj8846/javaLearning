package abstractTest;

public abstract class Employee 
{
	private String name;
	private int number;
	private MyDate birthday;
	
	public Employee(String name, int number, MyDate birthday) 
	{
		super();
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public MyDate getBirthday() {
		return birthday;
	}
	public abstract int earnings();
	public String toString()
	{
		return (name+number+birthday);
	}
}
