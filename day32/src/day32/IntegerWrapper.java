package day32;

public class IntegerWrapper {

	public static void main(String[] args) {
		Integer ii=30; //auto boxing
		System.out.println(ii.intValue());
		//Integer ��ü�� int������ �ٲٴ� ���
		
		//Integer->double
		System.out.println(ii.doubleValue());
		//Integer->float
		System.out.println(ii.floatValue());
		//Integer->String
		System.out.println(ii.toString()+3);
		//String�� ������ ���ڿ��� �����̴�.
		System.out.println("hello"+" world");
		
		
		
	}

}
