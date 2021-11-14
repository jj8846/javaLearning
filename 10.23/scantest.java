//导包
import java.util.Scanner;


class scantest
{
	public static void main(String[] a)
	{/*
			//scanner实例化
			Scanner scan=new Scanner(System.in);
			//调用相关类型（类似%d的转化）
			//int num1=scan.nextInt();
			//System.out.println(num1);


			System.out.println("请输入你的姓名:>");
			String name = scan.next();
			System.out.println(name);

			System.out.println("请输入你的年龄:>");
			int age=scan.nextInt();
			System.out.println(age);
			*/
/*
			//scanner实例化
			Scanner scan=new Scanner(System.in);



			System.out.println("请输入你的期末成绩");
			int result = scan.nextInt();
			if(result==100)
				System.out.println("奖励一辆BMW");
			else if(result>80 && result<=99)
		        System.out.println("奖励ipone pro max");
			else if(result>=60 && result<=80)
				System.out.println("奖励ipad");
			else
				System.out.println("去死吧你");
*/
/*
//scanner实例化 
			Scanner scan=new Scanner(System.in);


			System.out.println("请输入三个数字");
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			int num3=scan.nextInt();
			int max=num1>num2?num1:num2;
			max=max>num3?max:num3;

			System.out.println("最大值是:>"+max);
			*/


			//scanner实例化
			Scanner scan=new Scanner(System.in);
			
			System.out.println("请输入你的身高:>(单位：cm)");
			int height=scan.nextInt();

			System.out.println("请输入你的财富:>(单位：万)");
			int money=scan.nextInt();

			System.out.println("你帅吗? (true or false)");
			Boolean handsome=scan.nextBoolean();

			if(height>180 && money>1000 && handsome==true)
				System.out.println("我一定要嫁给他！！");
			else if(height>180 || money>1000 || handsome==true)
				System.out.println("嫁吧");
			else
				System.out.println("不嫁");
	}
}