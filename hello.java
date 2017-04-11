import java.util.Scanner;

public class hello
{
   public static void main(String arr[])
   {
	   int x,y;
	   Scanner in =new Scanner(System.in);
	   
	   System.out.println("enter x & y=");
	   x=in.nextInt();
	   y=in.nextInt();
	   
	   System.out.println("befor swaping two x & y\n x="+x+"\n y="+y);
	   
	   x=x+y;
	   y=x-y;
	   x=x-y;
	   
	   System.out.println("after swapping two x & y\n x="+x+"\n y="+y);
   }

}