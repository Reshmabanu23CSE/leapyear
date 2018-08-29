

import java.util.*;
import java.lang.*;
import java.io.*;


class Leap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter year:");
		int year=s.nextInt();
		if(year%4==0)
		{
			System.out.println("leap year");
			
		}
		else
		{
			System.out.println("not a leap year");
		}
		
	}
}
