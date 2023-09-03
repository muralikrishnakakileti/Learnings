package introS;
import java.util.Scanner;



public class Fabonacci {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int a=0;
		int b=1;
		int count =0;
		
		
		while(count <=num) {
			int temp=b;
//			System.out.println("temp"+temp);
			b=b+a;
//			System.out.println("b"+b);
			a=temp;
//			System.out.println("a"+a);
			count++;
//			System.out.println(count);
			
			
			/*
			 * int temp = b;
			 * b = b+a;
			 * a= temp;
			 * count++;
			 * 
			 * 
			 */
			
		}
		input.close();
		System.out.println(b);
	}
	
	
}
