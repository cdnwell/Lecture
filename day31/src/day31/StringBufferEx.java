package day31;

public class StringBufferEx {

	public static void main(String[] args) {
		String str ="test";
		StringBuffer buffer=new StringBuffer("test");
		
		str.replace('t', 'T');
		System.out.println(str);
		//변경되지 않는다.
		
		buffer.replace(1, 3, "ES");
		//StringBuffer 클래스의 replace는 매개변수가 다르다.
		//변경이 아니라 새로운 값을 넣고 저장한다.
		System.out.println(buffer);
		
	}
}
