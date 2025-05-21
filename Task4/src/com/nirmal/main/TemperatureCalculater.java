package com.nirmal.main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureCalculater
{
	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("========Well come to Temperature Calculator=========");
		while(true)
		{
			System.out.println("1. To Fahrenheit\n2. To Celsius\n3. Exit");
			System.out.println("Enter Choice : ");
			int choice=ss.nextInt();
			int n=0;double value=0.0; String formatted =null;
			switch(choice)
			{
			case 1:
				System.out.println("Enter Number for Temperature calculation :");
				 n=ss.nextInt();
				 value= toFahrenheit(n);				   
				   formatted = df.format(value);
				 
				System.out.println("Temperature : "+formatted+" Fahrenheit");
				break;
			case 2:
				System.out.println("Enter Number for Temperature calculation :");
				 n=ss.nextInt();
				 value= toCelsius(n);				   
				   formatted = df.format(value);
				System.out.println("Temperature : "+formatted+" Celsius");
				break;
			case 3:
				System.out.println("==========Exit===========");
				System.exit(0);
				break;
				default :
					System.out.println("Enter A valid Choice");
			}
			
		}
		

	}
	public static double toCelsius(double n)
	{
		return (n-32)*0.55;
	}
	
	public static double toFahrenheit(double n)
	{
		return (n*1.8)+32;
	}
	

}
