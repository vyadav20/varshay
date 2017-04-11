
public class loops 
{
   public static void main(String arr[])
   
   {
	  /* int x=40;
	   
	   if(x==30)
	   {
		 System.out.println("30"+x);  
	   }
	   else if(x==20)
	   {
		   System.out.println("20"+x);
	   }
	   else
	   {
		   System.out.println(x);
	   }
   }*/
	  /* int x=1;
	   do
	   {
		   System.out.println(x);
		   x++;
		   //System.out.println("\n");
	   }
	   while(x<5);
   } */
	   /*char grade='c';
	   switch(grade)
	   {
		   case 'a':
			 System.out.println("***"+"a++");
			 break;
		   case 'b':
		   case 'c':
			   System.out.println("**"+"a+");
			   break;
		   case 'd':
			   System.out.println("*"+"a");
			   break;
			default:
				System.out.println("retry");
	   }*/
	   int x=2,y=0;
	   for(;y<10;y++)
	   {
		   if(y%x==0)
		   continue;
		   else if(y==8)
			   break;
		   else
		   System.out.println(y);
	   }
}
}

