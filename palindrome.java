
package introS;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name=input.next();
		int i=0,j=name.length()-1;

		//malayalam
		//charat antey prathi character ni check chesukuntu velthundhi
		while(i<j) {
			if(name.charAt(i)!= name.charAt(j))
			{
				System.out.println("not a pali");
				System.exit(0);
			}
			i++;
			j--;
			
		}		input.close();

		System.out.println("pali");
	}
}
