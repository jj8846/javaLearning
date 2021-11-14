package InterfacePractice;

public class ComparableCircle extends Circle implements CompareObject 
{

	public ComparableCircle(double redius) {
		super(redius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) 
	{
		if(o==null)
			return 0;
		if(o instanceof Circle)
		{
			Circle circle=(Circle)o;
			return (int)(this.getRedius()-circle.getRedius());
		}
		else
			return 0;
	}
	
}
