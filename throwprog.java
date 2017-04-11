
public class throwprog
{
   static void hello()
   {
	   try
	   {
		   throw new ArithmeticException("demo");
		   
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println("after try and catch");
	   }
   }
   public static void main(String arr[])
   {
	   hello();
   }
}
