package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		int[]num = {17, 271, -27, 51, 1, 37};
		Arrays.sort(num);
		System.out.println("The Max num is" + num[num.length-1]);
		
		System.out.println("The Min Num is" +num[0]);

	}

}
