package practice2;

import org.omg.CORBA.PUBLIC_MEMBER;

public class GeometricTest
{
		public static void main(String[] args) 
		{
			GeometricTest test =new GeometricTest();
			
			
			test.displayGeometricObject();
			
		}
		
		
		public boolean equalsArea(GeometricObject a,GeometricObject b)
		{
			if(a.findArea()==b.findArea())
				return true;
			else
				return false;
		}
		public void displayGeometricObject(GeometricObject a)
		{
			System.out.println("面积是:"+a.findArea());
		}
