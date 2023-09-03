package introS;

import java.util.Scanner;

public class newPalindrome {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String name = input.next();
		palindrome(name);
		
		
		input.close();
	}

	static void palindrome(String name){
		int i =0,j = name.length()-1;
		while(i<=j) {
			if(name.charAt(i)!=name.charAt(j)) {
				System.out.println("not a pali");
				System.exit(1);
				
			}
			i++;
			j--;
			
		}
		System.out.println("palindrome " + name);
	}
}
