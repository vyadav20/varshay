import java.util.Scanner;

public class reverse 
{
	public static void main(String arr[])
	{
  int r=0,n;
  
  System.out.println("enter the numbers=");
  Scanner in = new Scanner(System.in);
  n= in.nextInt();
  
  while(n!=0)
  {
	  r=r*10;
	  r=r+n%10;
	  n=n/10;
  }
  System.out.println("reverse="+r);
}
	
}
