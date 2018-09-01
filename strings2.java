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
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
			i++;
		}
		System.out.print(" ");
		for(int i=1;i<str.length();i++)
		{
			
			System.out.print(str.charAt(i));
			i++;
		}
	}
}
