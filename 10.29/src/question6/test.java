package question6;
import java.util.Scanner;

public class test 
{
		public static void main(String[] args) 
		{
			PassObject a=new PassObject();
			Circle c=new Circle();
			Scanner scan=new Scanner(System.in);
			int time = scan.nextInt();
			a.printArea(c, time);
			System.out.println("现在的半径是:"+c.radius);
		}
}
