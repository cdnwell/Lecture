package test;

public class Finally {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println("연결");
		}
		catch(ArithmeticException e) {
			System.out.println("산술 예외");
		}
		finally {
			System.out.println("연결 해제");
		}
				
	}

}
