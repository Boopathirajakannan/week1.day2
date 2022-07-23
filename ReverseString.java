package week1.day2;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "boopathi";
		char[] charArray = str.toCharArray();
		int len = str.length();
		for (int i = charArray.length-1; i >= 0; i--) 

			System.out.println(charArray[i]);


	}


}


