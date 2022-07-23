package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "amazon";
		char ch = 'b';
		int count = 0;

		char[] any = str.toCharArray();
		for (int i = 0; i < any.length; i++) {
			if (any[i] == ch) {
				count++;
			}
		}
		System.out.println(count);

	}

}
