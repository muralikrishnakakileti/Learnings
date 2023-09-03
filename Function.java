package introS;

import java.util.Scanner;

public class Function {
	public  static void main(String[] args) {
		sum();
	
		
		
	}
	
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
