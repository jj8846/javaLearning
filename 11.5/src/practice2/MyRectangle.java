package practice2;

public class MyRectangle extends GeometricObject
{
		
		double width;
		double height;
		public MyRectangle(double width,double height,String color, double weight) 
		{
			super(color, weight);
			// TODO Auto-generated constructor stub
			this.width=width;
			this.height=height;
		}
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		
		public double findArea()
		{
			return height*width;
		}
}
