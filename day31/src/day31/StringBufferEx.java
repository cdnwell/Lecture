package day31;

public class StringBufferEx {

	public static void main(String[] args) {
		String str ="test";
		StringBuffer buffer=new StringBuffer("test");
		
		str.replace('t', 'T');
		System.out.println(str);
		//������� �ʴ´�.
		
		buffer.replace(1, 3, "ES");
		//StringBuffer Ŭ������ replace�� �Ű������� �ٸ���.
		//������ �ƴ϶� ���ο� ���� �ְ� �����Ѵ�.
		System.out.println(buffer);
		
	}
}
