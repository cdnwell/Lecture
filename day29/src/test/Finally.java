package test;

public class Finally {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println("����");
		}
		catch(ArithmeticException e) {
			System.out.println("��� ����");
		}
		finally {
			System.out.println("���� ����");
		}
				
	}

}
