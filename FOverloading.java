package introduction2;

public class FOverloading {
	public static void main(String[] args) {
		fun(1);
		fun("murali");
	}
	
	
	static void fun(int a) {
		System.out.println(a);
	}
	
	static void fun(String a) {
		System.out.println(a);
	}
}
