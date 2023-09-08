package introduction2;

import java.util.Arrays;

public class variableArgs {
	public static void main(String[] args) {
//		output(2,5,1,4,7,8,9,9);
		 
		
		multiple(1,2,"Mutrali","hjsajdfj");
	}
//	static void output(int...v) {
//		System.out.println(Arrays.toString(v));
//		
//	}
	
	static void multiple(int a,int b,String...v) {
		System.out.println(Arrays.toString(v));
	}
		
	
	
}
