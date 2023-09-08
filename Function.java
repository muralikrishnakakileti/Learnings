package introduction2;

import java.util.Scanner;

public class Function {
	public  static void main(String[] args) {
		int sum =sum3(30,40);
	System.out.println(sum);
		
		/// to caall that down one -->sum();
	}
	
	static int sum3(int a,int b) {
	 int sum=a+b;
	 return sum;
	}
	
	
	///another method
	
	 static void  sum() {
		Scanner input=new Scanner(System.in);
		int num1,num2,sum;
		num1= input.nextInt();
		num2 = input.nextInt();
		sum = num1+num2;
		System.out.println(sum);
		
		input.close();
	}
	
	
	
	
}
