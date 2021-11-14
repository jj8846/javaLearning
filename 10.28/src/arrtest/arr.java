package arrtest;
/*
 * 1.找到数组中的最大值
 * 2.找到数组的总和
 * 3.反转数组
 * 4.复制数组
 * 5.数组排序
 * 6.遍历数组
 * 7.查找指定元素
 */

public class arr 
{
	//查找最大值
		public int findmax (int[] arr)
		{
			int max=0;
			for(int i=0;i<arr.length;i++)
			{
				max=arr[i]>max?arr[i]:max;
			}
			return max;
		}
		//算出总和
		public int sum (int[] arr)
		{
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum += arr[i];
			}
			return sum;
		}
		//遍历数组
		public void walk(int[] arr)
		{
			for(int i=0;i<arr.length;i++)
			{
				 System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		//排序
		public void sort(int[] arr)
		{
			 for(int i=0;i<arr.length-1;i++)
			 {
				 for(int j=0;j<arr.length-i-1;j++)
				 {
					 if(arr[j]>arr[j+1])
					 {
						 int temp=arr[j];
						 arr[j]=arr[j+1];
						 arr[j+1]=temp;
					 }
				 }
			 }
		}
		//反转数组
		public void reserve(int[] arr)
		{
			int left=0;
			int right=arr.length-1;
			while(left<right)
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
		//二分查找，找到了返回下标所在位置
		
}
