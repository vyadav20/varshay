

public class exception
{
	
    public static void main(String arr[])
    { 
    	try
    	{
    	int a,b,c;
    	a=10;
    	b=0;
    	c=a/b;
    	System.out.println(c);
    	
       }
    
    catch(ArithmeticException e)
    {
    	System.out.println("result");
    }
    	finally
    	{
    	   System.out.println("after try and catch");
    	}
    	 int a=10;
    	 int b=5;
    	int c=a/b;
    	System.out.println(c);
    }
    
}
