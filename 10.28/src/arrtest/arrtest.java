package arrtest;



public class arrtest 
{
		
		public static void main(String[] args)
		{
				int[] arr=new int[]{55,0,90,44,-98,26};
				arr test1=new arr();
				
				test1.walk(arr);
				
				test1.sort(arr);
				test1.walk(arr);
				
				test1.reserve(arr);
				test1.walk(arr);
				
				int max=test1.findmax(arr);
				System.out.println("最大值是:"+max);
				
			    int sum=test1.sum(arr);
			    System.out.println("总和是:"+sum);
			    
			    
				
		}
}
