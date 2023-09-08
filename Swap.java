package introduction2;

public class Swap {
	public static void main(String[] args) {
		int a =20;
		int b= 40;
		Swap(a,b);
		System.out.println(a+" "+b);

		
	}
	
	static void Swap(int a, int b) {
		int temp= a;
		a= b;
		b= temp;
	}
}
