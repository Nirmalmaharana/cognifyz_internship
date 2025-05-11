package com.nirmal.patternprinter;

import java.util.Scanner;

public class PatternPrinter {

	public static void main(String[] args)
	{
		System.out.println("Generateing and Printing A Simple Number Patterns ");
		System.out.println("Select The Pyramid Type ");
		
		Scanner sc=new Scanner(System.in);
		
		while(true) 
			{
			System.out.println("\n1.NUMBER PYRAMID \n2.BUTTERFLY \n3.DIAMOND \n4.Exit ");
			System.out.println("----------------------------------------");
			System.out.println("Enter The Number Pattern Which One You Want To Print :");
			int choice=sc.nextInt();
			System.out.println("Enter The Length Of Pyramid :");
			int n=sc.nextInt();
		
			switch(choice)
		{
		case 1:
			numberPyramid(n);
			break;
		case 2:
			butterfly(n);
			break;
		case 3:
			diamond(n);
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Enter A Valid Choice...");
		}
		}//end While
	}
	public static void numberPyramid(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=n-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
	}
	public static void butterfly(int n)
	{
		  for(int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=i;j++)
	            {
	            System.out.print("*");
	            }
	            
	            for(int k=n-i;k>=1;k--)
	            {
	                System.out.print(" ");
	            }
	            
	            for(int s=n-i;s>=1;s--)
	            {
	            	System.out.print(" ");
	            	
	            }
	            for(int b=1;b<=i;b++)
	            {
	            	System.out.print("*");
	            }
	            
	        System.out.println();
	        }
	        //reverse
	        for(int i=n;i>=1;i--)
	        {
	            for(int j=1;j<=i;j++)
	            {
	            System.out.print("*");
	            }
	            
	            for(int k=n-i;k>=1;k--)
	            {
	                System.out.print(" ");
	            }
	            
	            for(int s=n-i;s>=1;s--)
	            {
	            	System.out.print(" ");
	            	
	            }
	            for(int b=1;b<=i;b++)
	            {
	            	System.out.print("*");
	            }
	            
	        System.out.println();
	        }
	}
	public static void diamond(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=n-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1;i>0;i--)
		{
			for(int s=1;s<=n-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

