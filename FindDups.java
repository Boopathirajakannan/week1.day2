package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]data = {2, 5, 4, 8, 2, 7, 4};
		Arrays.sort(data);
		for (int i = 0; i < data.length-1; i++) {
			if(data[i]==data[i+1])
				
			System.out.println("The Dups"+ data[i]);
				
		}
			
		}
		
}
