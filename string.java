
public class string 
{
  public static void main(String arr[])
  {
	 String str1=new String("hiii"); 
	 String str2=" hello";
	 String str3="bye";
	 String str4="hiii";		 
	 System.out.println(str1);
	 System.out.println(str2);
	 System.out.println(str1==str2);
	 System.out.println(str1.equals(str4));
	 System.out.println(str3.charAt(2));
	 System.out.println(str2.length());
	 System.out.println(str1.compareTo(str3));
	 System.out.println(str1.toUpperCase());
	 System.out.println(str1.concat(str2));
	 System.out.println(str1.indexOf('i'));
	 System.out.println(str1.replace('i', 'm'));
	 System.out.println(str1.lastIndexOf('i'));
	 System.out.println(str2.trim());
	 System.out.println(str3.substring(1));//ye
	 System.out.println(str2.toString());//it will return the same value/return the string object itself
	 //System.out.println(str1.valueOf());
	 System.out.println();
  }
}
