package introS;
import java.util.Scanner;


public class SimpleInterest {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			
			int pprincipleAmount=input.nextInt();
			
			int time=input.nextInt();
			int rateOfInterest=input.nextInt();
			System.out.println("enter time" +pprincipleAmount);
			System.out.println("enter time" +time);
			System.out.println("enter time" +rateOfInterest);
			
			int simpleInterest=(pprincipleAmount*time*rateOfInterest/100);
			
			System.out.println(simpleInterest);
			
			
			input.close();
		}

}
