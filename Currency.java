package introS;
import java.util.Scanner;

public class Currency {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double rupees= input.nextDouble();
		int dollar= 75;

		double currency=(rupees/dollar);
		
		System.out.println(currency);
		input.close();
	}
}
