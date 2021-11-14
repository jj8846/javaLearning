package swapwithmethod;
import java.util.Scanner;

public class test 
{
	public static void main(String[] args)
			{
				/*swap a=new swap();
				Data data=new Data();
				a.swap(data);
				System.out.println(data.m+" "+data.n);*/
		
				//写一个程序交换数组中的两个元素
				int m,n;
				Scanner scan=new Scanner(System.in);
				m=scan.nextInt();
				n=scan.nextInt();
		 		swap swap1=new swap();
		 		Data data=new Data();
		 		swap1.swaparr(data,m,n);
		 		swap1.walkarr(data);
			}
}
