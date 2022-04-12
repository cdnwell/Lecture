package day06;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		int i=3;
		float f=3.14f;
		double d=3.14;
		char c='a';
		System.out.println(s instanceof String);
		System.out.println(Integer.valueOf(i) instanceof Integer ); // int는 원시 자료형이라 클래스가 아니다 
		//Integer도 되지 않는다.
		System.out.println(Float.valueOf(f) instanceof Float);
		System.out.println(Double.valueOf(d) instanceof Double);
		System.out.println(Character.valueOf(c) instanceof Character);
	}

}
