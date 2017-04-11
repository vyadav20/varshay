
class movie1
{
	    String name,category;
	    double rating;

     movie1()
    {
    	System.out.println("\t\t\t\t WELCOME TO THE SHOW \n");
    }
    void mov(String n, String c,int r)
    {
    	rating=r;
    	name=n;
    	category=c;
    	System.out.println("\t Movies Details Are Given Below-:\n");
    }
}

public class movie extends movie1
{
	void show()
	{
		System.out.println(" 1)");
		name="abcd\n";
		category="dancing\n";
		rating=2.5;
		System.out.println(name+category+rating);
	}
	void show(int a)
	{
		System.out.println(" \n\n2)");
		name="abcd2\n";
		category="dancing\n";
		rating=3.5;
		System.out.println(name+category+rating);	
	}
	void show(int a,int b)
	{
		System.out.println(" \n\n3)");
		name="chennai express\n";
		category="romantic\n";
		rating=4;
		System.out.println(name+category+rating);	
	}
	
	
	public static void main(String arr[])
	{
		movie a=new movie();
		 a.mov("a","b",3);
		 a.show();
		a.show(2);
		a.show(2,3);
		
	}
    
	
}



