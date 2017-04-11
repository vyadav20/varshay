import java.util.*;


public class userinput 
{

	  public static void main(String arr[])
	  {
		  Scanner srr = new Scanner(System.in);
		  System.out.println("enter the name");
		  String name= srr.nextLine();
		  Scanner sr = new Scanner (System.in);
		  System.out .println("please enter A");
	         int a = sr.nextInt();
	         if ( a==1)
	   	  {
	   		 System.out.println("first"+a); 
	   	  }
	   	  else if(a==2)
	   	  {
	   		  System.out.println("second"+a);
	   	  }
	   	  else if(a==3)
	   	  {
	   		  System.out.println("third"+a);
	   	  }
	   	  else
	   	  {
	   		  System.out.println("wrong input");
	   	  }
		
	  }
}
