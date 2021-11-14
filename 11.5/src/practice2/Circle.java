package practice2;

public class Circle extends GeometricObject
{
		

		private double radius;
		public Circle(double radius,String color, double weight) 
		{
			super(color, weight);
			// TODO Auto-generated constructor stub
			this.radius=radius;
		}
		public double getRadius() 
		{
			return radius;
		}
		public void setRadius(double radius) 
		{
			this.radius = radius;
		}
		
		public double findArea()
		{
			return Math.PI*radius*radius;
		}

		
		
		

		
		
}
