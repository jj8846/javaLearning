package learning;

public class methodsTest 
{
		public void test(int... a)
		{
			System.out.println("你正在执行可变形参的int类型");
		}
		//public void test(String... a)
		//{
		//	System.out.println("你正在执行可变形参的String类型")
		//}
		public void test(String[] a)
		{
			System.out.println("你正在执行数组形参的String类型");
		}
}
