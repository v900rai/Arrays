package edu.selfpractice.programing.string;

import java.util.Scanner;

public class sumOfFristNaturalNuber 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the sum of frist naturl number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=0; i<=num; i++)
		{
			sum =sum+i;
		}
		System.out.println("total sum number "+sum);
		
	}

}
