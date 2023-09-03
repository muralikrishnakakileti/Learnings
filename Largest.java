package introS;

public class Largest {
	public static void main(String[] args) {
		int a= 5005505;//or use the Scanner
		int b= 209090;
		int c= 848235;

		int max=a;
		if (b>max) {
			max=b;
		}if(c>max) {
			max=c;
		}
		
		System.out.println(max);
		
	}
}
