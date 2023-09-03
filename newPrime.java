package introS;

import java.util.Scanner;

public class newPrime {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
			
			int num= input.nextInt();
		prime(num);
		
		input.close();
	}
	

static void prime(int num) {
	boolean isPrime = true;
		for (int i=2;i<=num;i++) {
			if(num%i==0) {
				isPrime =false;
				break;
			}
		}

if (isPrime) {
    System.out.println(num + " is prime");
} else {
    System.out.println(num + " is not a prime number");
}
}}
