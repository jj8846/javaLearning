package InterfacePractice;

public class InterfaceTest 
{
	public static void main(String[] args)
	{
			ComparableCircle c1=new ComparableCircle(5);
			ComparableCircle c2=new ComparableCircle(6);
			System.out.println(c1.compareTo(c2));
	
	Integer num1= new Integer(5);
	int num2=num1.intValue();
	System.out.println("************************");
	System.out.println(num2);
	System.out.println("########################");
	String str1=String.valueOf('b');
	System.out.println(str1);
	System.out.println("__________________");
	Integer num3=Integer.parseInt("15");
	System.out.println(num3);
	}
}
abstract class AbstractTest
{
	public abstract void test1();
}
