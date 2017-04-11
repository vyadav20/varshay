class a
{
void msg(){System.out.println("hello");}	
}
 class b
 {
	 void msg(){System.out.println("wel");}
 }
public class inheritt extends a
{
	public static void main(String arr[])
	{
   //inheritt oo=new a();(right hand side is the object and we can not create an obj to the other class
		a oo=new inheritt();//this is alo k
		//inheritt oo=new inheritt();
   oo.msg();
	}	   
}
