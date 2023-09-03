package introS;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int num = input.nextInt();
		
		Armstrong(num);
		
		input.close();
	}
	
		
 static void Armstrong(int num) {
	 int orgnum= num;
	 int sum =0;
	 int numdigits = (int)Math.log10(num)+1;
	 while(num>0) {
		 int digit = num%10;
		 sum+= Math.pow(digit, numdigits);
		 num/=10;
		 
	 }
	 if( sum == orgnum) {
		 System.out.println(orgnum +" it is  arm strong");
	 }
	 else {
		 System.out.println(orgnum +" no it is ");
	 }
 }
	}

