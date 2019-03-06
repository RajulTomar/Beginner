import java.io.*;
import java.util.*;
class Guvinumber
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	  int x;
	  System.out.println("enter the value of x");
	  x=sc.nextInt();
	  
	  if (x>0)
		System.out.println("number is positive");
	  
	  else if (x==0)
		System.out.println("number is zero");
	  
	  else
		System.out.println("number is negative");
	}
}

  
  