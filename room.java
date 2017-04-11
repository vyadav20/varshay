class one
{
	int l,b;
	one (int x ,int y)
	{
		l=x;
		b=y;
	}
	int area()
	{
		int z=l*b;
		return (z);
		
	}
}


public class room 
{

	public static void main(String arr[])
	{
		one o = new one(7,1);
		int area = o.area();
		System.out.println("area of room ="+area);
	}
}


