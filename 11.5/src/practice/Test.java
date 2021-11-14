package practice;

import java.io.File;

import javax.xml.crypto.Data;

public class Test 
{
		public static void main(String[] args) 
		{
				Person p2=new Man();
				if(p2 instanceof Person)
				{
					System.out.println("p2是person类 ");
				}
				if(p2 instanceof Man)
				{
					System.out.println("p2是Man类");
				}
		}
		File a=new File("15");
}
