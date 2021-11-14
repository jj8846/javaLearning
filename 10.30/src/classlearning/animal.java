package classlearning;

public class animal 
{
		private int legs;
		int age;
		//legs设置
		public void setlegs(int n)
		{
			if(n>0 && n%2==0)
			{
				legs=n;
			}
			else
			{
				System.out.println("legs修改不符合标准");
			}
		}
		//legs访问
		public int getlegs()
		{
			return legs;
		}
}
