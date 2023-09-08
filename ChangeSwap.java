package introduction2;

import java.util.Arrays;

public class ChangeSwap {
	public static void main(String[] args) {
		int[] arr= {1,2,5,7,8,0};
		change(arr);
		System.out.println(Arrays.toString(arr));
		//Arrays means taking the integer array convert into string format
		
		
	}
	
	static void change(int[] nums) {
		nums[0]=99;
	}
}
