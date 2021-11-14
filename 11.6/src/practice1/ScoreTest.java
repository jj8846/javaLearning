package practice1;

import java.util.Scanner;
import java.util.Vector;


public class ScoreTest 
{
	
	
	public static void main(String[] args) 
	{
		//创建vector
		Vector v =new Vector();

		//添加元素也就是学生的成绩(-1)代表结束
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			int input=scan.nextInt();
			if(input==-1)
			{
				break;
			}
			//jdk5.0之前
			Integer temp=new Integer(input);
			v.addElement(temp);
			
			//自动装包
			//v.addElement(input);
		}
		//取出向量中学生的最大成绩
		int max=0;
		for(int i=0;i<v.size();i++)
		{
			int temp=(Integer)v.elementAt(i);
			max=max>temp?max:temp;
		}
		System.out.println("最高分:"+max);
		//进行评级 
		for(int i=0;i<v.size();i++)
		{
			
//			自动版
			int temp=(max-(int)v.elementAt(i));
			System.out.println("第"+i+1+"个同学成绩为:"+v.elementAt(i));
			System.out.print("等级为:");
			if(temp<10)
				System.out.println('A');
			else if(temp<20)
				System.out.println('B');
			else if(temp<30)
				System.out.println('C');
			else
				System.out.println('D');
		}
	}
}
