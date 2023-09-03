package introS;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int reverse=0;
		
		
		while(n>0) {
			int rem=n%10;
			n/=10;
			reverse=reverse*10+rem;
		}
		
		System.out.println(reverse);
		
		
		input.close();
	}
}
