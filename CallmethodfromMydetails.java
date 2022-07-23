package week1.day2;

public class CallmethodfromMydetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class name - name of code to be called
		Mydetails Call = new Mydetails ();
		
		//to dall the method
		
		String myName = Call.getMyName();
		System.out.println("My Name is:" +myName);
		long myNum = Call.getMyNum();
		System.out.println("My Mobile Num is " +myNum);
		Call.getMyAdd();
	}

}
