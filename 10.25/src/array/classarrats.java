package array;

import java.util.Arrays;


public class classarrats 
{
		public static void main(String[] args)
		{
			int[] array1=new int []{1,2,3,4,5};
			int[] array2=new int []{3,5,4,2,1};
			boolean Isequal=Arrays.equals(array1, array2);
			System.out.println(Isequal);
			
			Arrays.sort(array2);
			Isequal=Arrays.equals(array1, array2);
			System.out.println(Isequal);
			
			System.out.println(Arrays.toString(array1));
			System.out.println(Arrays.toString(array2));
			
			Arrays.fill(array2, 10);
			System.out.println(Arrays.toString(array2));
			
			
		}
}
