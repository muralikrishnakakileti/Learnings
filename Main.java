package introS;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) 
	{
		Scanner input =new Scanner(System.in);
		System.out.println("enter the year number ");
		int year= input.nextInt();
		if(isLeapYear(year))
		{
			System.out.println(year +"it is a leap year");
		}
		else {
			System.out.println(year +" its not");
		}

		input.close();		
	}

	public static boolean isLeapYear(int year) {
		if(year%4==0) 
		{
			if(year%100==0) 
			{
				if(year%400==0) 
				{
					return true;
				}else {
					return false;
				}
			}else {
				return true;
			}

		}else {
			return false;
		}
	}
}


