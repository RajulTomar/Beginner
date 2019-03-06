import java.io.*;
import java.util.*;
class Guvievenodd
{
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
		int number;
		System.out.println("enter the number");
		number=sc.nextInt();
		
		if (number<0)
			System.out.println("invalid input");
	
		if (number%2==0)
		System.out.println("number is even");
	
		else  
		System.out.println("number is odd");
	}
}