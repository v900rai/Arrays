package edu.selfpractice.programing.string;

import java.util.Scanner;

public class sumOfEvenAndOddNumberSingleProgram 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		if(num%2==0)
		{
			for(int i=0; i<=num; i=i+2)
			{
				sum=sum+i;
			}
			System.out.println("Enter the sum  even number "+sum);
		}
		else
		{
			for(int i=1; i<=sum; i=i+2)
			{
				sum=sum+i;
			}
		     System.out.println("sum of odd number"+sum);	
	}
	}

}
