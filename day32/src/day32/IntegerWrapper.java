package day32;

public class IntegerWrapper {

	public static void main(String[] args) {
		Integer ii=30; //auto boxing
		System.out.println(ii.intValue());
		//Integer 객체를 int형으로 바꾸는 방법
		
		//Integer->double
		System.out.println(ii.doubleValue());
		//Integer->float
		System.out.println(ii.floatValue());
		//Integer->String
		System.out.println(ii.toString()+3);
		//String의 덧셈은 문자열의 나열이다.
		System.out.println("hello"+" world");
		
		
		
	}

}
