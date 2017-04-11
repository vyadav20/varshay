
public class eception1 
{
   public static void main(String arr[])
   {
	   try
	   {
	   int array[] = new int[6];
	   for(int x=1;x<=6;x++)
	   {
		   array[x]=x;
		   System.out.println(array[x]);
	   }
	   }
	   catch(ArrayIndexOutOfBoundsException e)
	   {
		   System.out.println("try and applied\n");
	   }
	   finally
	   {
		   System.out.println("after try and catch statement");
	   }
   }
}
