import java.util.Scanner;
public class factorial 
{
   public static void main(String arr[])
   {
	   int a,b,c=1;
	   
	   System.out.println("enter the number to find out factorial=");
	   Scanner sr=new Scanner(System.in);
	   
	   a=sr.nextInt();
	   if(a<0)
	   {
		   System.out.println("number should be non zero");
	   }
	   else
		   {
		   for(b=1;b<=a;b++)
			   c=c*b;
			   System.out.println("the result="+b);
		   }
	   
   }
}
