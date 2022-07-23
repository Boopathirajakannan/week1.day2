package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int [] scores = {20, 40, 60, 80, 100};
		 * System.out.println(scores [4]);
		 */
		
	/*
	String [] names = new String[6];
	names [0] = "Raja";
	names [1] = "venket";
	names [2] = "satish";
	names [5] = "Mani";
	
	System.out.println(names [2]);
	*/
	
		/*
		int[] scores = new int[4];
		scores [0] = 10;
		scores [1] = 26;
		scores [2] = 63;
		scores [3] = 11;
		
		System.out.println(scores [3] );
		*/
			
		int scores [] = {20, 40, 60, 80, 100,20, 40, 60, 80, 100,20, 40, 60, 80, 100,
				20, 40, 60, 80, 100,20, 40, 60, 80, 100,20, 40, 60, 80, 100,
				20, 40, 60, 80, 100,20, 40, 60, 80, 100,20, 40, 60, 80, 100,20, 40, 60, 80, 100};
		//here i dont know the length to specify the index in the syso
		//so we have to count the values using length veriable
		
		int length = scores.length;
		
		System.out.println("The total count is:" +length);
		System.out.println(scores[2]);
		
		for (int i = scores.length-1; i >= 0; i--) {
			System.out.println(scores[i]);
			
		int n= 40;
		int count = 0;
		Arrays.sort(scores);
		/*
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			if (scores [i]==n)
			count++;} //count = count + 1
			
			System.out.println("The count of 40 is:" +count);
			Arrays.sort(scores);
			System.out.println(); }{
			*/
			//to reverse the arrays need to use Loop un reverse direction
			
				
			}
		}
			
			
		
		
	}	

