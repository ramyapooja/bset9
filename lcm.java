/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int m=sc.nextInt();
		int lcm=(n>m)?n:m;
		while(true)
		{
			if(lcm%n==0&&lcm%m==0)
			{
			  System.out.println(lcm);
			  break;
			}  
			++lcm;
		}
		
	}
}
