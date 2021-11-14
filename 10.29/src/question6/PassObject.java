package question6;

public class PassObject 
{
		public void printArea(Circle c,int time)
		{
			int j=0;
			System.out.println("半径                                       面积");
			for(int i=0;i<time;i++)
			{
				j++;
				c.radius=j;
				System.out.print(c.radius+"                       ");
				System.out.println(c.findArea(c.radius)); 
				
				
			}
		}
}
