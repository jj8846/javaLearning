package swapwithmethod;

public class swap 
{
		public void swaparr(Data data,int m,int n)
		{
			int temp=data.arr[m];
			data.arr[m]=data.arr[n];
			data.arr[n]=temp;
		}
		public void walkarr(Data data)
		{
			for(int i=0;i<data.arr.length;i++)
			{
				System.out.println(data.arr[i]);
			}
		}
}
